package com.abyasoft.neondrones.gameplay;

import com.abyasoft.neondrones.world.WorldConfig;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.abyasoft.neondrones.world.CollisionSystem;

public class BulletManager {

    private static final float BULLET_RADIUS = 2.5f;
    private final com.badlogic.gdx.math.Vector2 tmpB = new com.badlogic.gdx.math.Vector2();


    private static class Bullet {
        float x, y; boolean alive = true;
    }

    private final Array<Bullet> pool = new Array<>(128);
    private final Texture tex = new Texture("bullet_placeholder.png"); // 2x6, rectángulo

    public void spawn(float x, float y) {
        Bullet b = new Bullet();
        b.x = x; b.y = y;
        pool.add(b);
    }

    public void update(float dt) {
        for (int i = pool.size - 1; i >= 0; i--) {
            Bullet b = pool.get(i);
            if (!b.alive) { pool.removeIndex(i); continue; }
            b.y += WorldConfig.BULLET_SPEED * dt;
            if (b.y > WorldConfig.WORLD_H + 8f) { pool.removeIndex(i); }
        }
    }

    public void draw(SpriteBatch batch) {
        float hw = tex.getWidth()/2f;
        float hh = tex.getHeight()/2f;
        for (int i = 0; i < pool.size; i++) {
            Bullet b = pool.get(i);
            batch.draw(tex, b.x - hw, b.y - hh);
        }
    }

    public int hitEnemies(Array<Enemy> enemies) {
        int kills = 0;
        for (int i = pool.size - 1; i >= 0; i--) {
            Bullet b = pool.get(i);
            boolean bulletRemoved = false;

            for (int j = enemies.size - 1; j >= 0; j--) {
                Enemy e = enemies.get(j);
                if (!e.alive) continue;

                // chequeo círculo vs círculo
                tmpB.set(b.x, b.y); // usa un Vector2 tmpB en la clase para evitar alloc (defínelo como campo)
                if (CollisionSystem.circleVsCircle(tmpB, BULLET_RADIUS, e.pos, e.radius)) {
                    e.alive = false;
                    pool.removeIndex(i);
                    bulletRemoved = true;
                    kills++;
                    break;
                }
            }
            if (bulletRemoved) continue;
        }
        return kills;
    }


}

package com.abyasoft.neondrones.gameplay;

import com.abyasoft.neondrones.world.WorldConfig;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

public class BulletManager {
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
}

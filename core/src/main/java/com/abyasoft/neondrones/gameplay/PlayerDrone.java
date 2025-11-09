package com.abyasoft.neondrones.gameplay;

import com.abyasoft.neondrones.world.WorldConfig;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

/** Entidad jugador: movimiento con leve inercia y dibujo placeholder. */
public class PlayerDrone {
    public final Vector2 pos = new Vector2(WorldConfig.WORLD_W/2f, 24f);
    public final Vector2 vel = new Vector2();
    private final Texture sprite = new Texture("player_placeholder.png"); // 12x12, círculo blanco
    private float fireCooldown = 0f;

    public void update(float dt, Controls input) {
        // Aceleración basada en input
        float ax = 0f, ay = 0f, speed = WorldConfig.PLAYER_SPEED;
        if (input.left)  ax -= speed;
        if (input.right) ax += speed;
        if (input.up)    ay += speed;
        if (input.down)  ay -= speed;

        // Inercia leve (damping)
        vel.scl(WorldConfig.PLAYER_DAMPING);
        vel.add(ax * dt, ay * dt);
        pos.mulAdd(vel, dt);

        // Limitar dentro de la pantalla
        float half = sprite.getWidth()/2f;
        pos.x = MathUtils.clamp(pos.x, half, WorldConfig.WORLD_W - half);
        pos.y = MathUtils.clamp(pos.y, half, WorldConfig.WORLD_H - half);

        // enfriar disparo
        if (fireCooldown > 0f) fireCooldown -= dt;
    }

    public void tryFire(float dt, Controls input, BulletManager bullets) {
        if (!input.fire) return;
        if (fireCooldown <= 0f) {
            bullets.spawn(pos.x, pos.y + sprite.getHeight()/2f);
            fireCooldown = WorldConfig.BULLET_RATE;
        }
    }

    public void draw(SpriteBatch batch) {
        batch.draw(sprite, pos.x - sprite.getWidth()/2f, pos.y - sprite.getHeight()/2f);
    }
}

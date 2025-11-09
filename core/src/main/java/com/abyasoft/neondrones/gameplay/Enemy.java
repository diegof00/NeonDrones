package com.abyasoft.neondrones.gameplay;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.math.Vector2;

public class Enemy {
    public final Vector2 pos = new Vector2();
    public final Vector2 vel = new Vector2();
    public boolean alive = true;

    private static final Texture SPRITE = new Texture("enemy_placeholder.png");
    static { SPRITE.setFilter(TextureFilter.Nearest, TextureFilter.Nearest); }

    // Radio de colisión (más pequeño que el sprite para ser “justos”)
    public float radius = 6f; // ajusta luego si tu sprite/logica cambian

    // Tamaño “visible” (se dibuja escalado en mundo)
    public float size = 12f;

    public void update(float dt) {
        pos.x += vel.x * dt;
        pos.y += vel.y * dt;
    }

    public void draw(SpriteBatch batch) {
        batch.setColor(Color.valueOf("ff5a5a")); // rojo suave
        batch.draw(SPRITE, pos.x - size/2f, pos.y - size/2f, size, size);
        batch.setColor(Color.WHITE);
    }
}

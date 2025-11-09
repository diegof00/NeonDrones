package com.abyasoft.neondrones.world;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture.TextureFilter;

/** Parallax vertical con dos capas. Escala al tamaño lógico del mundo (viewport). */
public class BackgroundScroller {
    private final Texture near = new Texture("bg_near.png"); // capa superior (detalles)
    private final Texture far  = new Texture("bg_far.png");  // capa inferior (lejana)

    private float yNear = 0f;
    private float yFar  = 0f;

    // Multiplicadores de velocidad (parallax)
    private static final float NEAR_SPEED_MUL = 1.0f;  // igual al scroll base
    private static final float FAR_SPEED_MUL  = 0.5f;  // más lento → sensación de distancia

    public BackgroundScroller() {
        // píxel nítido (importante para arte retro / partículas)
        near.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
        far.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
    }

    /** Avanza el scroll. No necesita conocer el viewport aquí. */
    public void update(float dt) {
        yNear -= WorldConfig.SCROLL_SPEED * NEAR_SPEED_MUL * dt;
        yFar  -= WorldConfig.SCROLL_SPEED * FAR_SPEED_MUL  * dt;
        // el clamp/loop lo hacemos en draw cuando sabemos el alto lógico (tileH)
    }

    /** Dibuja escalando las texturas al tamaño lógico actual del mundo. */
    public void draw(SpriteBatch batch, float worldW, float worldH) {
        // Cada tile ocupa TODO el ancho y el doble del alto del mundo.
        float tileW = worldW;
        float tileH = worldH * 2f;

        // Normalizamos y’s para evitar overflow y mantener loop perfecto
        while (yNear <= -tileH) yNear += tileH;
        while (yFar  <= -tileH) yFar  += tileH;

        // Capa lejana primero
        batch.draw(far,  0, yFar,  tileW, tileH);
        batch.draw(far,  0, yFar + tileH, tileW, tileH);

        // Capa cercana encima
        batch.draw(near, 0, yNear, tileW, tileH);
        batch.draw(near, 0, yNear + tileH, tileW, tileH);
    }

    public void dispose() {
        near.dispose();
        far.dispose();
    }
}

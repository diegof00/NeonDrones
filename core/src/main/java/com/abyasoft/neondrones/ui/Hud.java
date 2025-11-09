package com.abyasoft.neondrones.ui;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Hud {
    private final BitmapFont font = new BitmapFont(); // default font
    private int score = 0;

    public void addScore(int points) { score += points; }
    public int getScore() { return score; }

    public void draw(SpriteBatch batch, float worldW, float worldH) {
        // esquina superior-izquierda con pequeño margen
        font.draw(batch, "SCORE: " + score, 6f, worldH - 6f);
    }
}

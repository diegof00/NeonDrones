package com.abyasoft.neondrones.world;

public final class WorldConfig {
    private WorldConfig() {}

    // Resolución virtual (16:9) – pixel perfect friendly
    public static final float WORLD_W = 360f;
    public static final float WORLD_H = 480f;

    // Timestep fijo (consistencia de física / feel)
    public static final float FIXED_DT = 1f / 120f;

    // Velocidades base (unidades de mundo/segundo)
    public static final float SCROLL_SPEED = 150f;
    public static final float PLAYER_SPEED = 3000f;
    public static final float PLAYER_DAMPING = 0.88f;

    // Balas
    public static final float BULLET_SPEED = 600f;
    public static final float BULLET_RATE = 0.06f; // segundos entre disparos
}

package com.abyasoft.neondrones.gameplay;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.math.MathUtils;

public class EnemySpawner {
    // Timing
    private float time = 0f;
    private float spawnEvery = 1.25f;     // segundos entre spawns (se reduce lentamente)
    private float spawnTimer = 0f;

    // Velocidad vertical de los enemigos (descendiendo)
    private float minSpeed = -120f; // hacia abajo
    private float maxSpeed = -300f;

    public void update(float dt, Array<Enemy> enemies, float worldW, float worldH) {
        time += dt;
        spawnTimer -= dt;

        // Rampa de dificultad: reduce spawnEvery hasta un mínimo
        spawnEvery = MathUtils.clamp(1.25f - time * 0.02f, 0.08f, 1.25f);

        if (spawnTimer <= 0f) {
            spawnTimer = spawnEvery;
            spawnEnemy(enemies, worldW, worldH);
        }
    }

    private void spawnEnemy(Array<Enemy> enemies, float worldW, float worldH) {
        Enemy e = new Enemy();
        float margin = worldW * 0.06f;
        e.pos.set(MathUtils.random(margin, worldW - margin),
            worldH + 20f);        // nace fuera de la vista
        e.vel.set(0f, MathUtils.random(maxSpeed, minSpeed)); // descendiendo
        e.size = 12f; // visible
        e.radius = 6f; // colisión
        enemies.add(e);
    }
}

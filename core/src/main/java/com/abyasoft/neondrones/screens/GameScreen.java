package com.abyasoft.neondrones.screens;

import com.abyasoft.neondrones.NeonDronesGame;
import com.abyasoft.neondrones.world.WorldConfig;
import com.abyasoft.neondrones.world.BackgroundScroller;
import com.abyasoft.neondrones.gameplay.PlayerDrone;
import com.abyasoft.neondrones.gameplay.BulletManager;
import com.abyasoft.neondrones.gameplay.Controls;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen {
    private final NeonDronesGame game;
    private final OrthographicCamera camera = new OrthographicCamera();
    private final FitViewport viewport =
        new FitViewport(WorldConfig.WORLD_W, WorldConfig.WORLD_H, camera);
    private final SpriteBatch batch = new SpriteBatch();

    // Sistemas/Entidades del prototipo
    private final BackgroundScroller bg = new BackgroundScroller();
    private final PlayerDrone player = new PlayerDrone();
    private final BulletManager bullets = new BulletManager();
    private final Controls input = new Controls();

    // Fixed timestep accumulator
    private float acc = 0f;

    public GameScreen(NeonDronesGame game) {
        this.game = game;
        //camera.zoom = 1.6f;
        camera.position.set(WorldConfig.WORLD_W/2f, WorldConfig.WORLD_H/2f, 0);
        camera.update();
    }

    @Override public void render(float delta) {

        float worldW = viewport.getWorldWidth();
        float worldH = viewport.getWorldHeight();

        // Update (fixed)
        acc += Math.min(delta, 0.25f);
        while (acc >= WorldConfig.FIXED_DT) {
            step(WorldConfig.FIXED_DT);
            acc -= WorldConfig.FIXED_DT;
        }

        // Draw
        ScreenUtils.clear(0.10f, 0.11f, 0.12f, 1f);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        bg.draw(batch, worldW, worldH);        player.draw(batch);             // dron (forma simple)
        bullets.draw(batch);            // balas
        batch.end();
    }

    private void step(float dt) {
        input.poll();                          // leer teclado
        bg.update(dt);                         // scroll
        player.update(dt, input);              // mover dron
        bullets.update(dt);                    // mover balas
        player.tryFire(dt, input, bullets);    // disparo rítmico
        // (colisiones con enemigos vendrán luego)
    }

    @Override public void resize(int w, int h) { viewport.update(w, h, true); }
    @Override public void show() { }
    @Override public void pause() { }
    @Override public void resume() { }
    @Override public void hide() { }
    @Override public void dispose() { batch.dispose(); bg.dispose(); }
}

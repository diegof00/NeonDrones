package com.abyasoft.neondrones.gameplay;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Controls {
    public boolean left, right, up, down, fire, bomb;

    public void poll() {
        left  = Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.LEFT);
        right = Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.RIGHT);
        up    = Gdx.input.isKeyPressed(Input.Keys.W) || Gdx.input.isKeyPressed(Input.Keys.UP);
        down  = Gdx.input.isKeyPressed(Input.Keys.S) || Gdx.input.isKeyPressed(Input.Keys.DOWN);
        fire  = Gdx.input.isKeyPressed(Input.Keys.SPACE); // autofire en el prototipo (si prefieres tecla: Input.Keys.SPACE)a
        bomb  = Gdx.input.isKeyPressed(Input.Keys.E);
    }
}

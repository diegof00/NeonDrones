package com.abyasoft.neondrones;

import com.badlogic.gdx.Game;
import com.abyasoft.neondrones.screens.GameScreen;

public class NeonDronesGame extends Game {
    @Override public void create() {
        setScreen(new GameScreen(this)); // entra directo al juego (sin menú por ahora)
    }
}

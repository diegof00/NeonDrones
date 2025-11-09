package com.abyasoft.neondrones.world;

import com.badlogic.gdx.math.Vector2;

public final class CollisionSystem {
    private CollisionSystem() {}

    public static boolean circleVsCircle(Vector2 aPos, float aR, Vector2 bPos, float bR) {
        float dx = aPos.x - bPos.x;
        float dy = aPos.y - bPos.y;
        float r  = aR + bR;
        return dx*dx + dy*dy <= r*r;
    }
}

package com.excilys.formation.battleships.android.ui.ships;

import java.util.HashMap;
import java.util.Map;

import battleships.formation.excilys.com.battleships.R;
import battleships.ship.BattleShip;
import battleships.ship.Destroyer;

/**
 * Created by scaltot on 12/09/17.
 */

public class DrawableDestroyer extends Destroyer implements DrawableShip {

    private static final Map<Orientation, Integer> DRAWABLES = new HashMap<>();

    static {
        DRAWABLES.put(Orientation.NORTH, R.drawable.destroyer_n);
        DRAWABLES.put(Orientation.SOUTH, R.drawable.destroyer_s);
        DRAWABLES.put(Orientation.WEST, R.drawable.destroyer_w);
        DRAWABLES.put(Orientation.EAST, R.drawable.destroyer_e);
    }

    @Override
    public int getDrawable() {
        return DRAWABLES.get(this.getOrientation());
    }
}

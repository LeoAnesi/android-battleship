package com.excilys.formation.battleships.android.ui.ships;

import java.util.HashMap;
import java.util.Map;

import battleships.formation.excilys.com.battleships.R;
import battleships.ship.BattleShip;

/**
 * Created by scaltot on 12/09/17.
 */

public class DrawableBattleship extends BattleShip implements DrawableShip {

    private static final Map<Orientation, Integer> DRAWABLES = new HashMap<>();

    static {
        DRAWABLES.put(Orientation.NORTH, R.drawable.battleship_n);
        DRAWABLES.put(Orientation.SOUTH, R.drawable.battleship_s);
        DRAWABLES.put(Orientation.WEST, R.drawable.battleship_w);
        DRAWABLES.put(Orientation.EAST, R.drawable.battleship_e);
    }

    @Override
    public int getDrawable() {
        return DRAWABLES.get(this.getOrientation());
    }
}

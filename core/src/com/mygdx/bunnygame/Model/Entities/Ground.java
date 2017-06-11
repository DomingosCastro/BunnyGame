package com.mygdx.bunnygame.Model.Entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.bunnygame.Model.GameModel;

/**
 * Created by Domingos on 11/06/2017.
 */

public class Ground extends Platform {

    public Ground(World world, Rectangle bounds) {
        super(world, bounds);

        setCategoryFilter(GameModel.GROUND_BIT);
    }
}

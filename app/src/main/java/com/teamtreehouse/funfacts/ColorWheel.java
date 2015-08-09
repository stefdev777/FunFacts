package com.teamtreehouse.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Stefan on 8/7/2015.
 */
public class ColorWheel {

    public int getColor() {
        Random random = new Random();
        int rndNum = random.nextInt(mColors.length);
        return Color.parseColor(mColors[rndNum]);
    }

    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
}

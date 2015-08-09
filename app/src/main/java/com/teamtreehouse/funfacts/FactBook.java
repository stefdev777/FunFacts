package com.teamtreehouse.funfacts;

import android.content.Context;
import android.content.res.Resources;

import java.util.Random;

/**
 * Created by Stefan on 8/7/2015.
 */
public class FactBook {
    public String[] mFacts = null;
    
    public FactBook(Resources res) {
        if (mFacts == null)
            mFacts = res.getStringArray(R.array.fun_facts);
    }

    public String getFact() {
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}

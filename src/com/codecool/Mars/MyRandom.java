package com.codecool.Mars;

import java.util.Random;

public class MyRandom {
    private static Random random = new Random();

    public static boolean isSuccesOfAction(int chance) {
        return random.nextInt(100) < chance;
    }
}

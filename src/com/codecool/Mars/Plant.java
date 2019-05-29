package com.codecool.Mars;

public abstract class Plant {
    protected int producePerMonth;
    protected int id;
    private static int idCounter;

    public Plant(final int producePerMonth) {
        this.id = idCounter++;
        this.producePerMonth = producePerMonth;
    }

    public void growing() {
        producePerMonth += 4;
    }

    public int getProduction() {
        return producePerMonth;
    }
}

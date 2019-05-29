package com.codecool.Mars;

public abstract class EverGreener extends Plant {
    protected int monthCounter;
    protected int maxProduction = 70;
    protected String name;

    public EverGreener(final int producePerMonth, String name) {
        super(producePerMonth);
        this.name = name;
    }

    @Override
    public void growing() {
        increaseMonthCounter();
        if(monthCounter % 5 == 0){
            this.producePerMonth += 8;
        } else super.growing();
        if(producePerMonth >= maxProduction){
            monthCounter = maxProduction;
            System.out.println(this.name + this.id + " at full production!");
        }
    }

    public void increaseMonthCounter() {
        this.monthCounter++;
    }

}

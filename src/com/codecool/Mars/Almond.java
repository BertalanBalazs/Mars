package com.codecool.Mars;

public class Almond extends Plant implements growSomething {


    public Almond(final int producePerMonth) {
        super(producePerMonth);
    }

    @Override
    public void growShroom() {
        if(MyRandom.isSuccesOfAction(8)){
            producePerMonth += 10;
        }
    }

    @Override
    public void growRot() {
        if(MyRandom.isSuccesOfAction(13)){
            producePerMonth -= 14;
            Farm.setIsThereRot(true);
        }
    }

    @Override
    public void growing() {
        growShroom();
        growRot();
        if(producePerMonth < 40){
            producePerMonth *= 2;
        } else {
            super.growing();
        }
    }
}

package com.codecool.Mars;

public class Spruce extends EverGreener implements growSomething {
    @Override
    public void growShroom() {
        if(MyRandom.isSuccesOfAction(5)) this.producePerMonth += 15;
    }

    @Override
    public void growRot() {
        if(MyRandom.isSuccesOfAction(4)) {
            this.producePerMonth -= 20;
            Farm.setIsThereRot(true);
        }
    }

    public Spruce(final int producePerMonth, final String name) {
        super(producePerMonth, name);
    }
}

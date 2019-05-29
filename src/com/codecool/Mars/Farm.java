package com.codecool.Mars;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Plant> plants = new ArrayList<>();
    private static boolean isThereRot = false;
    private int totalProduction;

    public void simulateMonths(final int month) {
        for (int i = 0; i < month; i++) {
            if(!isThereRot){
                for (final Plant plant : plants) {
                    plant.growing();
                    setTotalProduction(plant.getProduction());
                }
            } else isThereRot = false;
        }
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void setTotalProduction(final int totalProduction) {
        this.totalProduction += totalProduction;
    }

    public int getTotalProduction() {
        return totalProduction;
    }

    public static void setIsThereRot(final boolean isThereRot) {
        Farm.isThereRot = isThereRot;
    }
}

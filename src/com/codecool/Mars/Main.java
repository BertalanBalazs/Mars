package com.codecool.Mars;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        init(farm, 2,2,2);
        farm.simulateMonths(80);

        System.out.println("The total production after 80 month is :" +farm.getTotalProduction());
    }

    private static void init(Farm farm, int numOfAlmond, int numOfSpruce, int numOfJupiner) {
        for (int i = 0; i < numOfAlmond; i++) {
            farm.addPlant(new Almond(50));
        }
        for (int i = 0; i < numOfSpruce; i++) {
            farm.addPlant(new Spruce(26, "Spruce"));
        }
        for (int i = 0; i < numOfJupiner; i++) {
            farm.addPlant(new Jupiner(14, "Jupiner"));
        }
    }

}

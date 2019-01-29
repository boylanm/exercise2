package com.boylan.csci;

public class Main {

    public static void main(String[] args) {
	double [] fahrHighTemp = {45,29, 10, 22, 41, 28, 33};
	double [] precChance = {95, 60, 25, 5, 0, 75, 90 };
        for (int i = 0; i < 7 ; i++) {
            if (fahrHighTemp[i] <= 32 ) {
                if (precChance[i] > 50) {
                    System.out.println("Day " + i + " has a temperature of "+ fahrHighTemp[i] + " and a precipitation chance of " + precChance[i] +  "% .");
                }


            }


        }
    }
}

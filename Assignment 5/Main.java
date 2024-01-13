package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nGe din langd i meter: ");
        double langd = sc.nextDouble();
        System.out.print("\n Ge din vikt i kg: ");
        double vikt = sc.nextDouble();
        double BMI = vikt / (langd * langd);
        System.out.print("\nDitt BMI är: " + BMI);
        System.out.print("\n BMI KATEGORIER: \n Starvation: less than 15 \n Underweight: less than 18.5 \n Ideal: 18.5 - 25 \n Overweight: Between 25 - 30 \n Morbidly Obese: Greater than 40");
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ge ett heltal");

        String heltal = scan.nextLine();

        System.out.println("Ge ett realtal");

        String realtal = scan.nextLine();

        System.out.println("Ge ett tecken");

        String tecken = scan.nextLine();




        System.out.println("Du gav heltalet " +heltal+", realtalet " + realtal + " och teckent " + tecken);


    }
}
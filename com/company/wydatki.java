package com.company;
import java.util.Scanner;

public class wydatki {


    float suma_wydatkow;
    public void wydatki2() {
        float stale = 0;
        float jedzenie = 0;
        float przyjemnosci = 0;
        float ubrania = 0;
        float paliwo = 0;
        float inne = 0;



        int wyborwydatkow;
        Scanner choice = new Scanner(System.in);


        do {
            System.out.println("Wybierz opcje:");
            wyborwydatkow = choice.nextInt();

            switch (wyborwydatkow) {
                case 1 -> {
                    System.out.println("Wprowadź swoje stale wydatki:");
                    stale = choice.nextFloat();
                }
                case 2 -> {
                    System.out.println("Wprowadź swoje wydatki na jedzenie:");
                    jedzenie = choice.nextFloat();
                }
                case 3 -> {
                    System.out.println("Wprowadź swoje wydatki na przyjemnosci:");
                    przyjemnosci = choice.nextFloat();
                }
                case 4 -> {
                    System.out.println("Wprowadź swoje wydatki na ubrania:");
                    ubrania = choice.nextFloat();
                }
                case 5 -> {
                    System.out.println("Wprowadź swoje wydatki na paliwo:");
                    paliwo = choice.nextFloat();
                }
                case 6 -> {
                    System.out.println("Wprowadź swoje inne wydatki:");
                    inne = choice.nextFloat();
                }
                case 7 -> System.out.println(suma_wydatkow);
            }
            suma_wydatkow = stale + jedzenie + przyjemnosci + ubrania + paliwo + inne;

        }
        while (wyborwydatkow != 8);


    }

    public float getsw() {
        return this.suma_wydatkow;
    }
}















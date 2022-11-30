package com.company;
import java.io.PrintWriter;
import java.util.Scanner;

public class menu extends wydatki{

    protected float bilans;
    protected float income;

    public void menu1() {
    System.out.println("To twoja własna kontrola wydatków:");

    Scanner choice = new Scanner(System.in);
    int choiceentry;
    this.income = 0;

        do {
        System.out.println("1. Wprowadź dochód");
        System.out.println("2. Wprowadź wydatki");
        System.out.println("3. Podsumowanie");
        System.out.println("4. Eksportuj do pliku txt");
        System.out.println("5. Koniec");
        System.out.println("Wybierz:");
        choiceentry = choice.nextInt();
            switch (choiceentry) {
                case 1 -> {
                    System.out.println("Wprowadź swój dochód:");
                    income = choice.nextFloat();
                }
                case 2 -> {
                    System.out.println("Wybierz wydatek");
                    System.out.println("1. Wydatki stale (raty, czynsz)");
                    System.out.println("2. Jedzenie");
                    System.out.println("3. Przyjemności");
                    System.out.println("4. Ubrania");
                    System.out.println("5. Paliwo");
                    System.out.println("6. Inne");
                    System.out.println("7. Podsumuj wydatki:");
                    System.out.println("8. Powrót");
                    this.wydatki2();
                }
                case 3 -> {
                    System.out.println("Twój dochód to:" + income);
                    System.out.println("Suma Twoich wydatków:" + getsw());
                    this.bilans = income - getsw();
                    System.out.println("Twój bilans wynosi: " + bilans);
                }
                case 4 -> {
                    try {
                        PrintWriter output = new PrintWriter("Podsumowanie.txt");

                        output.println("Twój dochód to:" + this.income);
                        output.println("Suma Twoich wydatków wynosi: " + this.suma_wydatkow);
                        output.println("Twój bilans to:" + this.bilans);

                        output.close();
                    }
                    catch(Exception e) {
                        e.getStackTrace();
                    }
                }
            }
                }while (choiceentry != 5);
            }


    }







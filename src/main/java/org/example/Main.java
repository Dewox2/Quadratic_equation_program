package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w programie do rozwiązywania ");

        System.out.print("Podaj a:");
        float a = scanner.nextFloat();

        if (a != 0){
            System.out.print("Podaj b:");
            float b = scanner.nextFloat();
            System.out.print("Podaj c:");
            float c = scanner.nextFloat();
            System.out.println(a + "x^2 + " + (int) b + "x + " + c);

            double delta = b * b - 4 * a * c;

            if (delta < 0){
                System.out.println("Brak rozwiązań (delta < 0)");
            } else if (delta == 0) {
                double x;
                x = -b/ (2 * a);
                System.out.printf("Jedno rozwiązanie x = %f" + x);

            }else {
                double x1 = (- b + Math.sqrt(delta) / (2 * a));
                double x2 = (- b - Math.sqrt(delta) / (2 * a));
                System.out.printf("Istnieją dwa rozwiązania x1 = %f oraz x2 = %f"  + x1, x2);


            }


        }else {
            System.out.println("Parametr a równy 0");
        }


    }
}
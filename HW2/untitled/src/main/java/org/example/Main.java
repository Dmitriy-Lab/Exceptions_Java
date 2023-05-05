package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main1 = new Main();
        float a = main1.getFloat();
        System.out.println("Спасибо");
    }

    public float getFloat() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Введите дробное число: ");
                float number = sc.nextFloat();
                if( number == Float.POSITIVE_INFINITY ){
                    throw new InputMismatchException();
                }
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите число!");
                sc.nextLine();
            }
        }
    }
}
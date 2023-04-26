package org.example;

import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число 12");
        int inChar;
        String num = "";
        try {
            inChar = System.in.read();
            while (System.in.available() > 0) {
                num += (char) inChar;
                inChar = System.in.read();
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

        if ( num.length() == 0 ) {
            System.out.println("Поле ввода осталось пустым");
            System.exit(0);
        }

        try {
            Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть числом");
            System.exit(0);
        }
        if ( Integer.parseInt(num) != 12 ) {
            System.out.println("Вы ввели другое число");
        } else {
            System.out.println("Спасибо");
        }
    }
}


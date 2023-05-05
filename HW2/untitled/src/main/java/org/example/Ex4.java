package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        Ex4 ex4 = new Ex4();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder inputString;
        System.out.print("Введите строку: ");
        inputString  = ex4.inputText(reader);
        System.out.println("Спасибо");
    }
    public StringBuilder inputText(BufferedReader r) throws IOException {
        StringBuilder str = new StringBuilder(r.readLine());
        if (str.length() == 0) {
            throw new IOException("Строка не может быть пустой");
        }
        return str;
    }
}

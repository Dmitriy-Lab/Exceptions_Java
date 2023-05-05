package org.example;

public class Ex3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(a, b);
            int[] abc = {1, 2};
            abc[3] = 9;
        }  catch (NullPointerException ex) {
            System.out.println("Делимое число не может быть null");
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Индекс выходит за пределы массива");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}

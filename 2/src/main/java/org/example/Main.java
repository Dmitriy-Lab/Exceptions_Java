package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 6};
        int[] array2 = new int[]{2, 3, 4, 5};
        System.out.println(Arrays.toString(findDifArray(array1, array2)));
    }

    public static int[] findDifArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Внимание! Массивы разной длины");
            System.exit(0);
        }
        int[] array3 = new int[array1.length];
        int i, j, k;
        i = j = k = 0;
        while (i < array1.length) {
            array3[i] = array1[j] - array2[k];
            i++;
            j++;
            k++;
        }
        return array3;
    }
}

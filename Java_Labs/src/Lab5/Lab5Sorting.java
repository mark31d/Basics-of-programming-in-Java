package Lab5;

import java.util.Arrays;

public class Lab5Sorting {


    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }


    public static void insertionSort(double[] array) {
        for (int i = 1; i < array.length; i++) {
            double key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        double[] array = {5.4, 3.3, 8.1, 1.2, 9.5, 2.7};
        Arrays.sort(array);
        System.out.println("Початковий масив:");
        for (double num : array) {
            System.out.print(num + " ");
        }


        selectionSort(array);
        System.out.println("\nВідсортований масив методом вибору:");
        for (double num : array) {
            System.out.print(num + " ");
        }


        double[] array2 = {5.4, 3.3, 8.1, 1.2, 9.5, 2.7};


        insertionSort(array2);
        System.out.println("\nВідсортований масив методом вставки:");
        for (double num : array2) {
            System.out.print(num + " ");
        }
    }
}


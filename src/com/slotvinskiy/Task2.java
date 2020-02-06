package com.slotvinskiy;

//Написать метод.
//Входящий параметр: отсортированный массив типа int который содержит отрицательные и положительные значения.
// Вернуть отсортированный массив который состоит из квадратов значений.
//Не использовать при этом сстандартный метод sort.

//Пример
//Input:  [-4,1,0,3,10]
//Output: [0,1,9,16,100]

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static final int SIZE = 10;
    public static final Random RANDOM = new Random();
    public static final int BOUND = 10;

    public static void main(String[] args) {
        int[] originArray = initArray();
        sortArray(originArray);
        turnToPowSortedArray(originArray);
        System.out.println(Arrays.toString(originArray));
    }

    private static int[] initArray() {
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(BOUND);
        }
        return array;
    }

    private static void turnToPowSortedArray(int[] originArray) {
        for (int i = 0; i < originArray.length; i++) {
            originArray[i] *= originArray[i];
        }
        sortArray(originArray);
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j >= 0 && array[j] > array[j + 1]; j--) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

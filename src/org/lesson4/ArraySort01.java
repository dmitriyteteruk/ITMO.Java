//1.	Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
// Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
package org.lesson4;

import java.util.Arrays;

public class ArraySort01 {
    public static boolean isSorted(int[] array) {
        int i;
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int ar[] = {10, 9, 10, 20, 1, 5, 4};

        // выводим массив
        System.out.println("Вывести оригинальный массив:");
        System.out.println(Arrays.toString(ar));
        // выводим сообщение отсортирован массив или нет
        if (!isSorted(ar)) {
            System.out.println("Please, try again. Массив не отсортирован.\n");
        } else if (isSorted(ar)) {
            System.out.println("ОК. Массив отсортирован.\n");
        }

        // принудительно отсортируем массив и выведеем его
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        // выводим сообщение отсортирован массив или нет
        if (!isSorted(ar)) {
            System.out.println("Please, try again. Массив не отсортирован.\n");
        } else if (isSorted(ar)) {
            System.out.println("ОК. Массив отсортирован.\n");
        }



    }

}

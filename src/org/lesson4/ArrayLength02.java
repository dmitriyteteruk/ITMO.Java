/*
2.	Напишите программу, которая считывает с клавиатуры длину
массива (например, пользователь вводит цифру 4),
затем пользователь вводит 4 числа и на новой строке
выводится массив из 4 элементов. Пример вывода:

   Array length: 4
   Numbers of array:
   5
   6
   7
   2
   Result: [5, 6, 7, 2]
 */
package org.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLength02 {
    public static void main(String[] args) {
        int i;

        System.out.println("Введите количество элеметнов в массиве:");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        // передаем в массив i
        int[] arrayFromUser = new int[i];
        System.out.println("Ниже представлен сформированный массив с нулевыми значениями:");
        System.out.println(Arrays.toString(arrayFromUser));

        // просим пользователя ввести числа в массив
        System.out.println("Введите значения для элеметнов массива:");
        for (int a = 0; a < i; a++) {
            arrayFromUser[a] = scanner.nextInt();
            System.out.println("Введите следующее значение");
        }

        System.out.println("Количество элементов в массиве: " + arrayFromUser.length);
        System.out.println("Ниже представлен сформированный массив с заполненными значениями:");
        System.out.println(Arrays.toString(arrayFromUser));

        // вызываем метод изменения
        System.out.println("\nЗадача 3. Поменять местами первый и последний элементы массива.\n" +
                " Ниже представлен массив с измененными элементами:");
        exchange(arrayFromUser);

        System.out.println("\nЗадача 4. Из вышеуказанного массива выбрано первое уникальное значение\n");
        findFirstUnique(arrayFromUser);

        System.out.println("\nЗадача 5. заполняем рандомно массив\n");
        randomAndSort();
    }

    // задание 3 - метод замены первого и последнего элемента массива

    private static void exchange(int[] tempArray) {

        int firstElement;
        int lastElement;

        // сохраняем первый и последний элементы
        firstElement = tempArray[0];
        lastElement = tempArray[(tempArray.length - 1)];

        // меняем первый и последний элементы местами
        tempArray[0] = lastElement;
        tempArray[tempArray.length-1] = firstElement;
        System.out.println(Arrays.toString(tempArray));

    }

    // задание 4
    private static void findFirstUnique(int[] tempArray){
        for (int a : tempArray){
            int counter = 0;
            for (int b : tempArray){
                if (a == b) counter++;
            }
            if (counter == 1) {
                System.out.println("Первое уникальное значение в массиве: " + a);
                break;
            }
        }
    }

    // задание 5
    private static void randomAndSort(){
        int lengthOfArray = (int) (Math.random()*20);
        int[] TempArray = new int[lengthOfArray];
        for (int i = 0; i < TempArray.length; i++) {
            TempArray[i] = (int) (Math.random()*20);
        }
        System.out.println("Сгенерированный рандомный массив:");
        System.out.println(Arrays.toString(TempArray));
    }
}
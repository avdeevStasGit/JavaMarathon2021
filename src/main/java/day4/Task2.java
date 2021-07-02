package day4;

import java.util.Random;

/**
 * 2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя цикл for each вывести в консоль:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 *
 * Использовать сортировку запрещено.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = 0;
        int min = 10000;
        int counter = 0;
        int sum = 0;
        for (int element : array) {

            if(element > max) {
                max = element;
            }

            if(element < min) {
                min = element;
            }

            if(element % 10 == 0) {
                counter++;
            }

            if(element % 10 == 0) {
                sum += element;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + counter);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sum);
    }
}

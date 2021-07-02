package day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера
 * и заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль,
 * а также вывести в консоль информацию о:
 *
 *
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 *
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 *
 * Информация о массиве:
 * Длина массива: 10
 * Количество чисел больше 8: 1
 * Количество чисел равных 1: 0
 * Количество четных чисел: 6
 * Количество нечетных чисел: 4
 * Сумма всех элементов массива: 46
 */

public class Task1 {
    public static void main(String[] args) {
        int over8 = 0;
        int equals1 = 0;
        int evenNum = 0;
        int oddNum = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();

        int[] array = new int[n];


        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10) + 1);

            if(array[i] > 8) {
                over8++;
            }
            if(array[i] == 1) {
                equals1++;
            }
            if(array[i] % 2 == 0) {
                evenNum++;
            }
            if(array[i] % 2 != 0) {
                oddNum++;
            }

            sum += array[i];
        }

        System.out.println("Введено число " + n + "." + " Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(array) + "\n");

        System.out.println("Информация о массиве:\n");
        System.out.println("Длина массива: " + array.length + "\n" +
                           "Количество чисел больше 8: " + over8 + "\n" +
                           "Количество чисел равных 1: " + equals1 + "\n" +
                           "Количество четных чисел: " + evenNum + "\n" +
                           "Количество нечетных чисел: " + oddNum + "\n" +
                           "Сумма всех элементов массива: " + sum

        );


    }
}

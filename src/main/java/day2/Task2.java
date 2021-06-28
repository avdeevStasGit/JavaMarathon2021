package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от: ");
        int a = scanner.nextInt();
        System.out.println("Введите число до: ");
        int b = scanner.nextInt();

        for(int i = a; i < b; i++) {

            boolean x = i % 5 == 0;
            boolean y = i % 10 != 0;

            if((x) && (y)) {
                System.out.print(i + " ");
            }
        }
    }
}

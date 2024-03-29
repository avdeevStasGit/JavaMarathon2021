package day6;



/**
 * 1. Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня в пакет текущего дня.
 *
 *
 * В классах Автомобиль и Мотоцикл реализуйте два метода:
 * void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
 * и возвращает разницу между переданным годом и годом выпуска
 * транспортного средства (возвращаться должно всегда положительное число).
 *
 * В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
 */

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setAge(1990);
        car.setColor("Red");
        car.setModel("Porshe");

        Motorbike motorbike = new Motorbike(1995, "Blue", "PorsheMoto");

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2015));
        System.out.println(motorbike.yearDifference(1980));


    }
}

package day5;

/**
 * 2. Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
 * Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
 * Вывести в консоль значение каждого из полей, используя get методы.
 */

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2008, "Red", "BMW");

        System.out.println("Описание: " + "год " + motorbike.getAge() + ", цвет " + motorbike.getColor() + ", модель " + motorbike.getModel());
    }
}

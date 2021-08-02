package day13;

/**
 * Задача:
 *
 *
 * Нам необходимо создать свою небольшую социальную сеть на Java.
 *
 * Для этого мы должны реализовать следующие классы:
 * User - сущность “Пользователь”
 * Message - сущность “Сообщение”
 * MessageDatabase - класс, который будет заниматься хранением сообщений
 * Task1 - класс, где в методе main() мы будем тестировать нашу соц. сеть
 */

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Станислав");
        User user2 = new User("Кирилл");
        User user3 = new User("Иван");

        user1.sendMessage(user2, "Первое сообщение");
        user1.sendMessage(user2, "Второе сообщение");

        user2.sendMessage(user1, "Первое сообщение");
        user2.sendMessage(user1, "Второе сообщение");
        user2.sendMessage(user1, "Третье сообщение");

        user3.sendMessage(user1, "Первое сообщение");
        user3.sendMessage(user1, "Второе сообщение");
        user3.sendMessage(user1, "Третье сообщение");

        user1.sendMessage(user3, "Первое сообщение");
        user1.sendMessage(user3, "Второе сообщение");
        user1.sendMessage(user3, "Третье сообщение");

        user3.sendMessage(user1, "Первое сообщение");

        MessageDatabase.showDialog(user1, user3);
    }
}

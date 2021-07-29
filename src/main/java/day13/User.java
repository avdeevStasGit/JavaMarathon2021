package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username; // имя пользователя
    private List<User> subscriptions; // В этом списке должны храниться те пользователи, на которых подписан пользователь.

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<User>();
    }

    public void subscribe(User user){ // Подписывает пользователя на пользователя user
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) { // Возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
        boolean isSubscribed;
        isSubscribed = this.subscriptions.contains(user);

        return isSubscribed;
    }

    // Возвращает True, если пользователь user является другом и False, если пользователь user не является другом.
    // Подумайте, что такое дружба в контексте соц. сетей.
    public boolean isFriend(User user) {

    }

}
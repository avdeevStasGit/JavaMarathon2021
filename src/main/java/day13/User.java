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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<User>();
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
    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    // Отправляет сообщение с текстом text пользователю user.
    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}

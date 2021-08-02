package day13;

import java.util.Date;

public class Message {
    private User sender; // отправитель сообщения
    private User receiver; // получатель сообщения
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return
                "FROM: " + getSender() + "\n" +
                "TO: " + getReceiver() + "\n" +
                "ON: " + getDate() + "\n" +
                getText();
    }
}

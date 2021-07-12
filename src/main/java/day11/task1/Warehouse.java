package day11.task1;

public class Warehouse { //Склад
    public int countPickedOrders = 0; // Количество собранных заказов
    public int countDeliveredOrders = 0; // Количество доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "СКЛАД \n" +
                "Количество собранных заказов: " + countPickedOrders + "\n" +
                "Количество доставленных заказов: " + countDeliveredOrders;
    }
}

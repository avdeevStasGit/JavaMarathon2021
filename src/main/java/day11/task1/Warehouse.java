package day11.task1;

public class Warehouse { //Склад
    private int countPickedOrders; // Количество собранных заказов
    private int countDeliveredOrders; // Количество доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "СКЛАД \n" +
                "Количество собранных заказов: \n" + countPickedOrders +
                "Количество доставленных заказов: " + countDeliveredOrders;
    }
}

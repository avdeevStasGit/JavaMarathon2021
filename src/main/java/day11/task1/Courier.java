package day11.task1;

public class Courier implements Worker { // Курьер
    private int salary; // Заработная плата
    private boolean isPayed = false; // Был выплачен бонус или нет
    private Warehouse countDeliveredOrders;
    private int staff = 0; // Количество сотрудников

    public Courier(Warehouse countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
        staff++;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return " ";
    }

    @Override
    public int doWork() {
        this.countDeliveredOrders.countDeliveredOrders++;
        return this.salary += 100;
    }

    @Override
    public int bonus() {
        int salaryBonus = 0;

        if (getIsPayed()) {
            if (countDeliveredOrders.getCountDeliveredOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            }

            if (staff > 1 && countDeliveredOrders.getCountDeliveredOrders() == 10000) {
                int x = staff / 10000;
                isPayed = true;
                salaryBonus = 70000;
            }

            if (countDeliveredOrders.getCountDeliveredOrders() == 10000) {
                isPayed = true;
                salaryBonus = 70000;
            }
        }
        else {
            System.out.println("Бонус уже был выплачен");
        }
        return this.salary += salaryBonus;
    }




//    @Override
//    public int bonus() {
//        if(countDeliveredOrders.getCountDeliveredOrders() < 10000) {
//            System.out.println("Бонус пока не доступен");
//        }
//
//        int salaryBonus = 0;
//        if(countDeliveredOrders.getCountDeliveredOrders() == 10000) {
//            isPayed = true;
//            salaryBonus = 50000;
//        }
//
//        return this.salary += salaryBonus;
//    }
}

package day11.task1;

import java.lang.reflect.Field;

public class Picker implements Worker { // Сборщик
    private int salary; // Заработная плата
    private boolean isPayed = false; // Был выплачен бонус или нет
    private Warehouse countPickedOrders;
    private int staff = 0; // Количество сотрудников

    public Picker(Warehouse countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
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
        return "Сборщик: Заработная плата - " + salary + ", " ;
    }

    @Override
    public int doWork() {
        countPickedOrders.countPickedOrders++;
        return this.salary += 80;
    }

    @Override
    public int bonus() {
        int salaryBonus = 0;

        if (getIsPayed()) {
            if (countPickedOrders.getCountPickedOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            }

            if (countPickedOrders.getCountPickedOrders() == 10000) {
                if(staff > 1) {
                    salaryBonus = staff / 10000;
                }
                isPayed = true;
                salaryBonus = 70000;
            }
        }
        else {
            System.out.println("Бонус уже был выплачен");
        }
        return this.salary += salaryBonus;
    }
}

package day11.task1;

public class Courier implements Worker { // Курьер
    private int salary; // Pаработная плата
    private boolean isPayed; // Был выплачен бонус или нет

    public Courier(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return " ";
    }

    @Override
    public int doWork() {
        return 0;
    }

    @Override
    public int bonus() {
        return 0;
    }
}

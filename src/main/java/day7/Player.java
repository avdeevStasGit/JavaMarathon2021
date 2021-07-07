package day7;

public class Player {
    private int stamina; // выносливость
    private static int countPlayers = 0; // считает количество игроков на футбольном поле

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    public Player(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    //игрок бежит при вызове этого метода.
    public void run() {
        if(stamina == 0) {

        }
        stamina -= 1;
    }

    //выводит сообщение в зависимости от количества игроков на поле.
    public void info() {
        if(countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть ... свободных мест");
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }

}

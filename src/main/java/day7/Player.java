package day7;

public class Player {
    private int stamina; // выносливость
    private static int countPlayers = 0; // считает количество игроков на футбольном поле

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    public Player(int stamina) {
        if(countPlayers < 6) {
            this.stamina = stamina;
            Player.countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    //игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
    // * Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
    public void run() {
        if(this.stamina > MIN_STAMINA && this.stamina < MAX_STAMINA) {
            this.stamina -= 1;
            if(this.stamina == 0) {
                Player.countPlayers--;
            }
        }



        System.out.println("Выносливость: " + this.stamina);
    }

    //выводит сообщение в зависимости от количества игроков на поле.
    public static void info() {
        if(Player.countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + Math.abs(Player.countPlayers - 6) + " свободных мест.");
        }
        if(Player.countPlayers >= 6) {
            System.out.println("На поле нет свободных мест");
        }
    }

}

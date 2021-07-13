package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior");
        Paladin paladin = new Paladin("Paladin");
        Magician magician = new Magician("Magician");
        Shaman shaman = new Shaman("shaman");

        System.out.println("Воин атакует Паладина");
        warrior.physicalAttack(paladin);
        System.out.println("Паладин атакует Мага");
        paladin.physicalAttack(magician);
        System.out.println("Шаман лечит Мага");
        shaman.healTeammate(magician);
        System.out.println("Маг атакует Паладина, тип атаки М");
        magician.magicalAttack(paladin);
        System.out.println("Шаман атакует Воина, тип атаки Ф");
        shaman.physicalAttack(warrior);
        System.out.println("Паладин лечит себя");
        paladin.healHimself();
        System.out.println("Воин атакует Мага 5 раз");
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);

    }
}

package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    private int health = 100; //(здоровье)
    private double physDef = 0.2; //(процент поглощения физического урона)
    private double magicDef = 0.2;//(процент поглощения магического урона)
    private int physAtt = 10; //(величина физической атаки), по необходимости
    private int magicAtt = 15; //(величина магической атаки), по необходимости

    public Shaman(String nameHero) {
        super(nameHero);
    }

    @Override
    public void healHimself() {

    }

    @Override
    public void healTeammate(Hero hero) {

    }

    @Override
    public void magicalAttack(Hero hero) {

    }

    @Override
    public void physicalAttack(Hero hero) {

    }
}

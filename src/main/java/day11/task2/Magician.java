package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    private int health = 100; //(здоровье)
    private double physDef = 0.0; //(процент поглощения физического урона)
    private double magicDef = 0.8;//(процент поглощения магического урона)
    private int physAtt = 5; //(величина физической атаки), по необходимости
    private int magicAtt = 20; //(величина магической атаки), по необходимости

    public Magician(String nameHero) {
        super(nameHero);
    }

    @Override
    public void magicalAttack(Hero hero) {

    }

    @Override
    public void physicalAttack(Hero hero) {

    }
}

package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MIN_HEALTH = 0;
    private static final int HEALTH = 100; //(здоровье)

    private String name;
    private int health = 100;
    private double physDef; //(процент поглощения физического урона)
    private double magicDef;//(процент поглощения магического урона)
    private int physAtt; //(величина физической атаки)

    public Hero(String name) {
        this.name = name;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int heroHealthValue = hero.getHealth() - physAtt - (int) (physAtt * hero.physDef);

        if(heroHealthValue == 0 || heroHealthValue < 0) {
            System.out.println("Герой " + getName() + " пал в бою.");
            hero.setHealth(0);
        }
        else {
            hero.setHealth(heroHealthValue);
        }
        System.out.println(hero.toString());
    }

    @Override
    public String toString() {
        return "Hero: " + getName() +
                "HEALTH=" + getHealth();
    }

    public int getMIN_HEALTH() {
        return MIN_HEALTH;
    }

    public static int getHEALTH() {
        return HEALTH;
    }

    public int getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void setName(String name) {
        this.name = name;
    }
}

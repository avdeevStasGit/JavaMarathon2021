package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    private int magicAtt = 20; //(величина магической атаки), по необходимости

    public Magician(String nameHero) {
        super(nameHero);
        setPhysDef(0.0);
        setMagicDef(0.8);
        setPhysAtt(5);
    }

    @Override
    public void magicalAttack(Hero hero) {
        int heroHealthValue = hero.getHealth() - magicAtt - (int) (magicAtt * hero.getMagicDef());
        if(heroHealthValue < 0) {
            hero.setHealth(0);
            System.out.println("Герой " + getName() + " пал в бою.");
        }
        else {
            hero.setHealth(heroHealthValue);
        }
        System.out.println(toString());
    }
}

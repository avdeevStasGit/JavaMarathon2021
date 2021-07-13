package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    private static final int HEAL_HIMSELF_AMOUNT = 25;
    private static final int HEAL_TEAMMATE = 10;

    public Paladin(String nameHero) {
        super(nameHero);

        setPhysDef(0.5);
        setMagicDef(0.2);
        setPhysAtt(15);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + HEAL_HIMSELF_AMOUNT);
        if(getHealth() > getHEALTH()) {
            setHealth(getHEALTH());
        }
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + HEAL_TEAMMATE);
        if(hero.getHealth() > getHEALTH()) {
            hero.setHealth(getHEALTH());
        }
        System.out.println(toString());
    }
}

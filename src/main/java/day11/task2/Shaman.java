package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    private int magicAtt = 15; // Величина магической атаки
    private static final int HEALHIMSELF = 50;
    private static final int HEALTEAMMATE = 30;

    public Shaman(String nameHero) {
        super(nameHero);
        setPhysDef(0.2);
        setMagicDef(0.2);
        setPhysAtt(10);

    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + HEALHIMSELF);
        if(getHealth() > getHEALTH()) {
            setHealth(getHEALTH());
        }
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + HEALTEAMMATE);
        if(hero.getHealth() > getHEALTH()) {
            hero.setHealth(getHEALTH());
        }
        System.out.println(toString());
    }

    @Override
    public void magicalAttack(Hero hero) {
        int heroHealthValue = hero.getHealth() - magicAtt - (int) (magicAtt * hero.getMagicDef());
        if(heroHealthValue > 0) {
            setHealth(0);
            System.out.println(getName() + " откинулся.");
        }
        else {
            setHealth(heroHealthValue);
        }
        System.out.println(hero.toString());
    }

}

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

    }

    @Override
    public void healTeammate(Hero hero) {

    }

    @Override
    public void magicalAttack(Hero hero) {

    }

}

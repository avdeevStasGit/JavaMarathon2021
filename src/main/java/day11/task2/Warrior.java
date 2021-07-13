package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior(String nameHero) {
        super(nameHero);
        setPhysDef(0.8);
        setMagicDef(0.0);
        setPhysAtt(30);
    }

}

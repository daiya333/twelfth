package object;

public abstract class Creature {
    protected int hp;
    protected String name;
    protected int op;
    
    public abstract void attack(Charactor charactors);
}

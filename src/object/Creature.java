package object;

public abstract class Creature {
    protected int hp;
    protected String name;
    protected int op;
    
    public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			("名前がNULLです");
		} else if (name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException
			("名前の長さが不適切です");
		} else {
		    this.name = name;
		}
	}
	
	public int getOp() {
		return this.op;
	}
	
	public void setOp(int op) {
		if (op < 0) {
			this.op = 0;
		} else {
		    this.op = op;
		}
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
		    this.hp = hp;
		}
	}
    
    public abstract void attack(Charactor charactors);
}

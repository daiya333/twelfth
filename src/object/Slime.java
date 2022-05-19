package object;

public class Slime extends Creature {
	
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

	@Override
	public void attack(Charactor charactors) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "の攻撃");
    	charactors.hp -= this.op;
    	System.out.println(charactors.name + "に" + this.op + "のダメージ");
    	if (charactors.hp > 0) {
    	    System.out.println(charactors.name + "のHPは" + charactors.hp + "になった");
    	} else {
    		System.out.println(charactors.name + "を倒した");
    	}
	}

}

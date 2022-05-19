package object;

public class Slime extends Creature {
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			("���O��NULL�ł�");
		} else if (name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException
			("���O�̒������s�K�؂ł�");
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
		System.out.println(this.name + "�̍U��");
    	charactors.hp -= this.op;
    	System.out.println(charactors.name + "��" + this.op + "�̃_���[�W");
    	if (charactors.hp > 0) {
    	    System.out.println(charactors.name + "��HP��" + charactors.hp + "�ɂȂ���");
    	} else {
    		System.out.println(charactors.name + "��|����");
    	}
	}

}

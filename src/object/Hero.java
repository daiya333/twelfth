package object;

public class Hero extends Charactor {
	
	
	
	@Override
	public void attack(Creature creatures) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "�̍U��");
    	creatures.hp -= this.op;
    	System.out.println(creatures.name + "��" + this.op + "�̃_���[�W");
    	if (creatures.hp > 0) {
    	    System.out.println(creatures.name + "��HP��" + creatures.hp + "�ɂȂ���");
    	} else {
    		System.out.println(creatures.name + "��|����");
    	}
	}
}

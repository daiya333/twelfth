package object;

public class Dragon extends Creature {

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

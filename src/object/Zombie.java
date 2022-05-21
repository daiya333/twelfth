package object;

public class Zombie extends Creature {

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

package object;

public class Magician extends Charactor {

	@Override
	public void attack(Creature creatures) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "の攻撃");
    	creatures.hp -= this.op;
    	System.out.println(creatures.name + "に" + this.op + "のダメージ");
    	if (creatures.hp > 0) {
    	    System.out.println(creatures.name + "のHPは" + creatures.hp + "になった");
    	} else {
    		System.out.println(creatures.name + "を倒した");
    	}
	}
}

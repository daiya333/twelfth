package object;

public class Hero extends Charactor {
	
	
	
	@Override
	public void attack(Creature creatures) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "‚ÌUŒ‚");
    	creatures.hp -= this.op;
    	System.out.println(creatures.name + "‚É" + this.op + "‚Ìƒ_ƒ[ƒW");
    	if (creatures.hp > 0) {
    	    System.out.println(creatures.name + "‚ÌHP‚Í" + creatures.hp + "‚É‚È‚Á‚½");
    	} else {
    		System.out.println(creatures.name + "‚ð“|‚µ‚½");
    	}
	}
}

package object;

public class Dragon extends Creature {

	@Override
	public void attack(Charactor charactors) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "‚ÌUŒ‚");
    	charactors.hp -= this.op;
    	System.out.println(charactors.name + "‚É" + this.op + "‚Ìƒ_ƒ[ƒW");
    	if (charactors.hp > 0) {
    	    System.out.println(charactors.name + "‚ÌHP‚Í" + charactors.hp + "‚É‚È‚Á‚½");
    	} else {
    		System.out.println(charactors.name + "‚ð“|‚µ‚½");
    	}
	}

}

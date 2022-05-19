package object;
import java.util.Random;

public class Battle {
	 public static void battle(Charactor a, Charactor b, Creature c, Creature d) {
	    	Random rand = new Random();
			
	    	Charactor [] charactors = new Charactor[2];
	    	charactors[0] = a;
	    	charactors[1] = b;
	    	Creature [] creatures = new Creature[2]; 
	    	creatures[0] = c;
	    	creatures[1] = d;
	    	
			while ((a.hp > 0 || b.hp > 0) && (c.hp > 0 || d.hp > 0)) {
				
				for (Charactor ch : charactors) {
					if (ch.hp > 0) {
				    	if (c.hp > 0 && d.hp > 0) {
				            ch.attack(creatures[rand.nextInt(2)]);
				        } else if (c.hp <= 0) {
				        	ch.attack(creatures[1]);
				        } else {
				        	ch.attack(creatures[0]);
				        }
				        System.out.println("-------------------");
				    }
				}
				
		        for (Creature cr : creatures) {
					if (cr.hp > 0) {
				    	if (a.hp > 0 && b.hp > 0) {
				            cr.attack(charactors[rand.nextInt(2)]);
				        } else if (a.hp <= 0) {
				        	cr.attack(charactors[1]);
				        } else {
				        	cr.attack(charactors[0]);
				        }
				        System.out.println("-------------------");
				    }
				}
		        
			}
	    } 
}

package object;
import java.util.Random;

public class Battle {
	public static void battle(Charactor charactors[], Creature creatures[]) {
    	Random rand = new Random();
    	
    	
    	
    	
		while (whileCh(charactors) && whileCr(creatures)) {
		
		
			
			for (Charactor ch : charactors) {
				if (ch.hp > 0) {
					
						if (ifCr(creatures)) {
				    	    ch.attack(creatures[rand.nextInt(creatures.length)]);
				    	} else if (ifCr2(creatures)) {
				    		battleIn(creatures, ch);
			    	    } else {
			    	    	if(creatures[0].hp > 0) {
			    	    	    ch.attack(creatures[0]);
			    	        } else {
			    	        	break;
			    	        }
			    	    }
				    
			    	
			        System.out.println("-------------------");
			}
	      }
			

			
	        for (Creature cr : creatures) {
				if (cr.hp > 0) {
					
						if (ifCh(charactors)) {
				    	    cr.attack(charactors[rand.nextInt(charactors.length)]);
				    	} else if (ifCh2(charactors)) {
				    		battleIn2(charactors, cr);
			    	    } else {
			    	    	if(charactors[0].hp > 0) {
			    	    	    cr.attack(charactors[0]);
			    	        } else {
			    	        	break;
			    	        }
			    	    }
				    
			        System.out.println("-------------------");
			    }
			}
	        
	        if(judge(charactors)) {
	        	System.out.println("—EÒ‚½‚¿‚Í‘S–Å‚µ‚½");
	        } else if(judge2(creatures)) {
	        	System.out.println("‘S‚Ä‚Ì“G‚ğ“|‚µ‚½");
	        }
	        
		}
	}
	
	public static boolean whileCh(Charactor charactors[]) {
		int count = 0;
		for (int i = 0; i < charactors.length; i++) {
		    if(charactors[i].hp > 0) {
			    count++;
		    }
		}
		if (count > 0) {
		    return true;
		}else {
			return false;
	    }
	}
	
	public static boolean whileCr(Creature creatures[]) {
		int count = 0;
		for (int i = 0; i < creatures.length; i++) {
		    if(creatures[i].hp > 0) {
			    count++;
		    }
		}
		if (count > 0) {
		    return true;
		}else {
			return false;
	    }
    }
	
	public static boolean ifCh(Charactor charactors[]) {
		int count = 0;
		for (int i = 0; i < charactors.length; i++) {
		    if(charactors[i].hp > 0) {
			    count++;
		    }
		}
		if (count == charactors.length) {
		    return true;
		}else {
			return false;
	    }
	}
	
	public static boolean ifCr(Creature creatures[]) {
		int count = 0;
		for (int i = 0; i < creatures.length; i++) {
		    if(creatures[i].hp > 0) {
			    count++;
		    }
		}
		if (count == creatures.length) {
		    return true;
		}else {
			return false;
	    }
	}
	
	public static boolean ifCh2(Charactor charactors[]) {
		int count = 0;
		for (int i = 0; i < charactors.length; i++) {
		    if(charactors[i].hp > 0) {
			    count++;
		    }
		}
		if (count >= 2) {
		    return true;
		}else {
			return false;
	    }
	}
	
	public static boolean ifCr2(Creature creatures[]) {
		int count = 0;
		for (int i = 0; i < creatures.length; i++) {
		    if(creatures[i].hp > 0) {
			    count++;
		    }
		}
		if (count >= 2) {
		    return true;
		}else {
			return false;
	    }
	}
	
	public static void battleIn(Creature creatures[], Charactor ch) {
		Random rand = new Random();
		for (int i = creatures.length - 1, j = 1; i <= 1 && j < creatures.length - 1; i--, j++ ) {
		    if (creatures[i].hp <= 0) {
    	        ch.attack(creatures[rand.nextInt(creatures.length - j)]);
    	        break;
    	    } 
	    }
	}
	
	public static void battleIn2(Charactor charactors[], Creature  cr) {
		Random rand = new Random();
		for (int i = charactors.length - 1, j = 1; i <= 1 && j < charactors.length - 1; i--, j++ ) {
		    if (charactors[i].hp <= 0) {
    	        cr.attack(charactors[rand.nextInt(charactors.length - j)]);
    	        break;
    	    } 
	    }
	}
	
	public static boolean judge(Charactor charactors[]) {
		int count = 0;
		for (int i = 0; i < charactors.length; i++) {
		    if(charactors[i].hp > 0) {
			    count++;
		    }
		}
		if (count == 0) {
		    return true;
		}else {
			return false;
	    }
	}
	
	public static boolean judge2(Creature creatures[]) {
		int count = 0;
		for (int i = 0; i < creatures.length; i++) {
		    if(creatures[i].hp > 0) {
			    count++;
		    }
		}
		if (count == 0) {
		    return true;
		}else {
			return false;
	    }
	}
	
}
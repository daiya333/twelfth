package object;

public class Story {
    public static void main(String[] args) {
    	
    	Charactor [] charactors = new Charactor[2];
    	charactors[0] = new Hero();
    	charactors[1] = new Magician();
    	Creature [] creatures = new Creature[3]; 
    	creatures[0] = new Slime();
    	creatures[1] = new Zombie();
    	creatures[2] = new Dragon();
    	
    	
		
		charactors[0].setName("ゆうた");
		System.out.println("勇者の名前は" + charactors[0].getName());
		charactors[0].setHp(3);
		System.out.println("勇者のHPは" + charactors[0].getHp());
		charactors[0].setOp(1);
		System.out.println("勇者のOPは" + charactors[0].getOp());
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		charactors[1].setName("しずか");
		System.out.println("魔法使いの名前は" + charactors[1].getName());
		charactors[1].setHp(3);
		System.out.println("魔法使いのHPは" + charactors[1].getHp());
		charactors[1].setOp(1);
		System.out.println("魔法使いのOPは" + charactors[1].getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
	
		creatures[0].setName("スライム");
		System.out.println("魔物の名前は" + creatures[0].getName());
		creatures[0].setHp(3);
		System.out.println(creatures[0].getName() + "のHPは" + creatures[0].getHp());
		creatures[0].setOp(1);
		System.out.println(creatures[0].getName() + "のOPは" + creatures[0].getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		creatures[1].setName("ゾンビ");
		System.out.println("魔物の名前は" + creatures[1].getName());
		creatures[1].setHp(3);
		System.out.println(creatures[1].getName() + "のHPは" + creatures[1].getHp());
		creatures[1].setOp(1);
		System.out.println(creatures[1].getName() + "のOPは" + creatures[1].getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		creatures[2].setName("ドラゴン");
		System.out.println("魔物の名前は" + creatures[2].getName());
		creatures[2].setHp(3);
		System.out.println(creatures[2].getName() + "のHPは" + creatures[2].getHp());
		creatures[2].setOp(1);
		System.out.println(creatures[2].getName() + "のOPは" + creatures[2].getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
    	
    	
		Battle.battle(charactors, creatures);
		
    }  
}


    	
   	
       
   


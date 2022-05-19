package object;

import java.util.Random;

public class Story {
    public static void main(String[] args) {
    	
    	Hero h = new Hero();
    	
    	Magician m = new Magician();
		
    	
    	Slime s = new Slime();
    	
    	
    	Zombie z = new Zombie();
    	
    	
		
		h.setName("ゆうた");
		System.out.println("勇者の名前は" + h.getName());
	    h.setHp(5);
		System.out.println("勇者のHPは" + h.getHp());
		h.setOp(1);
		System.out.println("勇者のOPは" + h.getOp());
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		m.setName("しずか");
		System.out.println("魔法使いの名前は" + m.getName());
		m.setHp(5);
		System.out.println("魔法使いのHPは" + m.getHp());
		m.setOp(1);
		System.out.println("魔法使いのOPは" + m.getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
	
		s.setName("スライム");
		System.out.println("魔物の名前は" + s.getName());
		s.setHp(5);
		System.out.println(s.getName() + "のHPは" + s.getHp());
		s.setOp(1);
		System.out.println(s.getName() + "のOPは" + s.getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		z.setName("ゾンビ");
		System.out.println("魔物の名前は" + z.getName());
		z.setHp(5);
		System.out.println(z.getName() + "のHPは" + z.getHp());
		z.setOp(1);
		System.out.println(z.getName() + "のOPは" + z.getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
    	
    	
		Battle.battle(h, m, s, z);
		
    }  
}


    	
   	
       
   


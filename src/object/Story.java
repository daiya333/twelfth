package object;

import java.util.Random;

public class Story {
    public static void main(String[] args) {
    	
    	Hero h = new Hero();
    	
    	Magician m = new Magician();
		
    	
    	Slime s = new Slime();
    	
    	
    	Zombie z = new Zombie();
    	
    	
		
		h.setName("�䂤��");
		System.out.println("�E�҂̖��O��" + h.getName());
	    h.setHp(5);
		System.out.println("�E�҂�HP��" + h.getHp());
		h.setOp(1);
		System.out.println("�E�҂�OP��" + h.getOp());
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		m.setName("������");
		System.out.println("���@�g���̖��O��" + m.getName());
		m.setHp(5);
		System.out.println("���@�g����HP��" + m.getHp());
		m.setOp(1);
		System.out.println("���@�g����OP��" + m.getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
	
		s.setName("�X���C��");
		System.out.println("�����̖��O��" + s.getName());
		s.setHp(5);
		System.out.println(s.getName() + "��HP��" + s.getHp());
		s.setOp(1);
		System.out.println(s.getName() + "��OP��" + s.getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		z.setName("�]���r");
		System.out.println("�����̖��O��" + z.getName());
		z.setHp(5);
		System.out.println(z.getName() + "��HP��" + z.getHp());
		z.setOp(1);
		System.out.println(z.getName() + "��OP��" + z.getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
    	
    	
		Battle.battle(h, m, s, z);
		
    }  
}


    	
   	
       
   


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
    	
    	
		
		charactors[0].setName("�䂤��");
		System.out.println("�E�҂̖��O��" + charactors[0].getName());
		charactors[0].setHp(3);
		System.out.println("�E�҂�HP��" + charactors[0].getHp());
		charactors[0].setOp(1);
		System.out.println("�E�҂�OP��" + charactors[0].getOp());
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		charactors[1].setName("������");
		System.out.println("���@�g���̖��O��" + charactors[1].getName());
		charactors[1].setHp(3);
		System.out.println("���@�g����HP��" + charactors[1].getHp());
		charactors[1].setOp(1);
		System.out.println("���@�g����OP��" + charactors[1].getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
	
		creatures[0].setName("�X���C��");
		System.out.println("�����̖��O��" + creatures[0].getName());
		creatures[0].setHp(3);
		System.out.println(creatures[0].getName() + "��HP��" + creatures[0].getHp());
		creatures[0].setOp(1);
		System.out.println(creatures[0].getName() + "��OP��" + creatures[0].getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		creatures[1].setName("�]���r");
		System.out.println("�����̖��O��" + creatures[1].getName());
		creatures[1].setHp(3);
		System.out.println(creatures[1].getName() + "��HP��" + creatures[1].getHp());
		creatures[1].setOp(1);
		System.out.println(creatures[1].getName() + "��OP��" + creatures[1].getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		creatures[2].setName("�h���S��");
		System.out.println("�����̖��O��" + creatures[2].getName());
		creatures[2].setHp(3);
		System.out.println(creatures[2].getName() + "��HP��" + creatures[2].getHp());
		creatures[2].setOp(1);
		System.out.println(creatures[2].getName() + "��OP��" + creatures[2].getOp());
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
    	
    	
		Battle.battle(charactors, creatures);
		
    }  
}


    	
   	
       
   


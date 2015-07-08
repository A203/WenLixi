package com.desktop.demo3;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army army = new Army(10); 
		army.addWeapon(new Tank()); 
		army.addWeapon(new Flighter()); 
		army.addWeapon(new WarShip()); 
		army.attackAll(); 
	    army.moveAll(); 

	}

}
interface Assaultable{
	void attack();
}
interface Mobile{
	void move();
}
 abstract class Weapon implements Assaultable,Mobile{
	public void attack(){}
	public void move(){}
}
 class Tank extends Weapon{
	 public void attack(){
		 System.out.println("Tank attack") ;
	 }
	 public void move(){
		 System.out.println("Tank move");
	 }
 }
 class 	Flighter extends Weapon{
	 public void attack(){
		 System.out.println("Flighter attack");
	 }
	 public void move(){
		 System.out.println("Flighter move");
	 }
 }
 class WarShip extends Weapon{
	 public void attack(){
		 System.out.println("Warship attack");
	 }
	 public void move(){
		 System.out.println("Warship move");
	 }
 }
class Army{
	Weapon[] w; 
	 	private int count=0; 
 	public Army(int num) 
		{ 
			w = new Weapon[num]; 
	 	} 
	 	 
	 	public void addWeapon(Weapon wa) 
	 	{ 
	 		if(count<w.length) 
	 			w[count++]=wa; 
	 		else 
				System.out.println("error input"); 
	 	} 
		 
	 	public void attackAll() 
	 	{ 
	 		for(int i=0;i<count;++i) 
	 			w[i].attack(); 
	 	} 
	 	 
		public void moveAll() 
		{ 
		for(int i=0;i<count;++i) 
	 			w[i].move(); 

	}
}
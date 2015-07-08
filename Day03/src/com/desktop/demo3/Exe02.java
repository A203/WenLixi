package com.desktop.demo3;

public class Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	 public void attack(){}
	 public void move(){}
 }
 class 	Flighter extends Weapon{
	 public void attack(){}
	 public void move(){}
 }
 class WarShip extends Weapon{
	 public void attack(){}
	 public void move(){}
 }
class Army{
	Weapon [] w;
	public Army(int a) {
		w=new Weapon[a];
		System.out.println("该类所能拥有的最大武器数量为"+a);
	}
	void AddWeapon(Weapon wa){
		
	}
}
package com.company;

public class Main {

	public static void main (String[] args){
		Boss boss = new Boss(100,150);
		Weapon weapon = new Weapon ("Automat", "Kalachnikov");
		boss.setWeapon(weapon);

		System.out.println(boss.getWeapon());
		System.out.println(boss.getWeapon());


	}
}
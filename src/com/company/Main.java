package com.company;

public class Main {

    public static void main(String[] args) {
	 Boss boss = new Boss();
     boss.setAttackType("physical");
     boss.setDamage(50);
     boss.setHealth(700);
     boss.weapon.setNameOfGun("AK47");
     boss.weapon.setTypeOfGun("firearms");
        System.out.println(boss.getAttackType() + " " + boss.getDamage() + " " + boss.getHealth());


    }
}

package com.example.learnjava;

public class WeaponTest {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 15, 50);
        System.out.println("Weapon: " + sword.getName() + ", Damage: " + sword.getDamageInflicted() + ", Hit Points: " + sword.getHitPoints());

        sword.setDamageInflicted(20);  // Change damage
        sword.setHitPoints(55);        // Change hit points
        System.out.println("Updated Weapon: " + sword.getName() + ", Damage: " + sword.getDamageInflicted() + ", Hit Points: " + sword.getHitPoints());
    }
}


package com.example.learnjava;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        player.pickUpLoot(new Loot("Gold Coin", LootType.RING, 100));
        player.pickUpLoot(new Loot("Silver Ring", LootType.ARMOR, 50));
        player.showInventory();

        System.out.println("Initial Score: " + player.score());
        player.dropLoot("Silver Ring");
        System.out.println("Score after dropping loot: " + player.score());
    }
}

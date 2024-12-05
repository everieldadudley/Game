package com.example.learnjava;

public class EnemyTest {
    public static void main(String[] args) {
        Enemy troll = new Troll("Ugly Troll");
        troll.takeDamage(10);
        troll.showInfo();

        Enemy vamp = new Vampyre("Count");
        vamp.takeDamage(10);
        vamp.showInfo();

        Enemy vampKing = new VampyreKing("Dracula");
        vampKing.takeDamage(10);
        vampKing.showInfo();
    }
}


package org.academiadecodigo.bootcamp;

public class Hero {
    public String name;
    public int strength;
    public int speed;
    public int defense;
    public int health;
    public int roll = (int) (Math.ceil(Math.random() * 10));


    public Hero(String name,int strength, int speed, int defense, int health) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.defense = defense;
        this.health = health;
    }


    public String damage() {
        return (this.name + " caused " + (this.strength * roll) + " damage.");

    }


}

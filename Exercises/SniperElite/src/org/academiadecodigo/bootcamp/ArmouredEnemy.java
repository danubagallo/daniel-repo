package org.academiadecodigo.bootcamp;

public class ArmouredEnemy extends Enemy {
    private int armour;
    private int health;

    public ArmouredEnemy() {
        super();
        this.armour = 50;
        this.health = 80;
    }

    @Override
    public String getMessage() {
        return "You hit an Armoured Enemy.";
    }

    @Override
    public void hit(int d) {
        if (isDead() == false) {
            int x = (int) Math.ceil(Math.random() * 10);
            if (x <= 8) {
                if (this.armour > 0) {
                    armour = armour - d;
                    System.out.println("Sniper hits Armoured Enemy for " + d + " armour damage.");
                    if (armour < 0) {
                        health = health + armour;
                        System.out.println("Armoured enemy has also lost " + (0 - armour) + " health.");
                    } else {
                    }
                } else {
                    health = health - d;
                    System.out.println("Armoured enemy lost " + d + " health.");
                }
                if ((health > 0) && (armour > 0)) {
                    System.out.println("Armoured enemy still has " + armour + " armour and " + health + " health left.");
                } else if (health > 0) {
                    System.out.println("Armoured enemy still has " + health + " health left.");
                } else {
                System.out.println("Target has been neutralized.");
                setIsDead();
            }

        } else {
            System.out.println("Shot missed. Try again.");
        }
    }
}
}

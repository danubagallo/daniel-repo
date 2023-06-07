package org.academiadecodigo.bootcamp;

public class Barrel extends Enemy {

    private int health;

    public Barrel(BarrelType bt) {
        super();
        switch (bt) {
            case PLASTIC:
                this.health = 1;
            case WOOD:
                this.health = 2;
            case METAL:
                this.health = 3;
        }
    }

    @Override
    public void hit(int d) {
        if (isDead() == false) {
            int x = (int) Math.ceil(Math.random() * 10);
            if (x <= 8) {
                health = health - 1;
                if (health == 0) {
                    setIsDead();
                    System.out.println("Barrel has been hit and destroyed.");
                } else {
                    System.out.println("Barrel has been hit.");
                }
            } else {
                System.out.println("Shot missed. Try again.");
            }
        }
    }
}

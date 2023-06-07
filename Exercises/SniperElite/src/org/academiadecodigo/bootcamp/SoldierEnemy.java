package org.academiadecodigo.bootcamp;

public class SoldierEnemy extends Enemy {

    private int health;


    public SoldierEnemy() {
        super();
        this.health = 80;
    }

    @Override
    public String getMessage() {
        return "You hit a Soldier.";
    }

    @Override
    public void hit(int d) {
        if (isDead() == false) {
            int x = (int) Math.ceil(Math.random() * 10);
            if (x <= 8) {
                health = health - d;
                if (health <= 0) {
                    System.out.println("Soldier has been hit for " + d + " damage and died.");
                    setIsDead();
                } else {
                    System.out.println("Soldier has been hit for " + d + " damage and still has " + health + " left.");
                }

            } else {
                System.out.println("Shot missed. Try again.");
            }

        }
    }

}

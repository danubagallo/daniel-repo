package org.academiadecodigo.bootcamp;

public class Enemy extends GameObjects{

    private boolean isDead;

    public Enemy(){
        this.isDead = false;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setIsDead() {
        isDead = true;
    }

    public void hit(int d) {
    }

}

package org.academiadecodigo.bootcamp;

public class Tree extends GameObjects {

    private boolean isDead;

    public Tree(){
        this.isDead = true;
    }
    @Override
    public String getMessage() {
        System.out.println("You hit a tree... you suck.");
        return null;
    }


}

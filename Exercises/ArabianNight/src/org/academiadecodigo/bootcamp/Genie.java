package org.academiadecodigo.bootcamp;

public abstract class Genie {
    private int maxWishes;
    private int currentWishCount;

    public Genie() {
        this.maxWishes = 3;
        this.currentWishCount = 0;
    }

    public abstract void makeWish();

    public abstract void recycleDemon(Lamp whichLamp);

    public int getMaxWishes() {
        return maxWishes;
    }

    public int getCurrentWishCount() {
        return currentWishCount;
    }

    public void setCurrentWishCount() {
        currentWishCount++;
    }

}
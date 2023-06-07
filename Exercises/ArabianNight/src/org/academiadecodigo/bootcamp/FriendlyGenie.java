package org.academiadecodigo.bootcamp;

public class FriendlyGenie extends Genie {

    public void recycleDemon(Lamp whichLamp){

    }

    @Override
    public void makeWish() {
        if (getCurrentWishCount() < getMaxWishes()) {
            setCurrentWishCount();
            System.out.println("Your wish has been granted. You have " + (getMaxWishes() - getCurrentWishCount()) + " left.");
        } else {
            System.out.println("You don't have any wishes left.");
        }
    }
}

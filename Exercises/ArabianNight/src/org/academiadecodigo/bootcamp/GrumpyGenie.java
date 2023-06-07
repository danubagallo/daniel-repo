package org.academiadecodigo.bootcamp;

public class GrumpyGenie extends Genie {

    public void recycleDemon(Lamp whichLamp){

    }

    @Override
    public void makeWish() {
        if (getCurrentWishCount() != 1) {
            setCurrentWishCount();
            System.out.println("Your wish has been granted.");
        } else {
            System.out.println("Get out of here, I'm not granting any more wishes.");
        }
    }
}

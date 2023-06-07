package org.academiadecodigo.bootcamp;

public class DemonGenie extends Genie{


    private boolean recycled = false;

    @Override
    public void makeWish() {
        if (recycled == false) {
            System.out.println("Your wish has been granted... in my own way.");
        } else {
            System.out.println("Demon has been recycled...................");
        }
    }

    @Override
    public void recycleDemon(Lamp whichLamp) {
        if (recycled == false) {
            recycled = true;
            System.out.println("Demon recycled successfully! Lamp is now full with " + whichLamp.getMaxGenies() + " genies able to summon.");
            whichLamp.setGeniesCountZero();
            whichLamp.setRechargedTimes();
        } else {
            System.out.println("You cannot recycle twice the same demon!!!");
        }
    }
}
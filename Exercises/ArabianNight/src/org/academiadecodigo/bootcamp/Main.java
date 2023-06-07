package org.academiadecodigo.bootcamp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Lamp lamp1 = new Lamp(1);
        Lamp lamp2 = new Lamp(4);


        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp2.rubLamp();
        lamp2.rubLamp();
        lamp2.rubLamp();
        lamp2.rubLamp();

        Lamp.totalGeniesArray[1].makeWish();
        Lamp.totalGeniesArray[4].makeWish();
        Lamp.totalGeniesArray[4].recycleDemon(lamp1);
        Lamp.totalGeniesArray[4].recycleDemon(lamp1);
        Lamp.totalGeniesArray[4].makeWish();
        Lamp.totalGeniesArray[8].makeWish();

        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp1.getRechargedTimes();













    }
}

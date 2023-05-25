package org.academiadecodigo.bootcamp;

public class playground {
    public static void main(String[] args) {

        Hero soldier = new Hero("Daniel",6, 3, 5, 800);

        Hero barbarian = new Hero("Vinicius",8, 4, 2, 700);

        Hero rogue = new Hero("Ladino",5, 8, 3, 600);

        Hero paladin = new Hero("Paladino",7, 6, 4, 700);

        System.out.println(soldier.roll);


        System.out.println(soldier.damage());
        System.out.println(barbarian.damage());
        System.out.println(rogue.damage());
        System.out.println(paladin.damage());


    }

}


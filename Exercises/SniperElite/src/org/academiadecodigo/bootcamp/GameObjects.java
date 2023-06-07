package org.academiadecodigo.bootcamp;

public class GameObjects {

    public static GameObjects getNewObject() {
        int r = (int) Math.ceil(Math.random() * 13);
        if (r <= 4) {
            return new SoldierEnemy();
        } else if (r <= 8) {
            return new ArmouredEnemy();
        } else if (r <= 11) {
            int y = (int) Math.ceil(Math.random() * 3);
            if (y == 1) {
                return new Barrel(BarrelType.PLASTIC);
            } else if (y == 2) {
                return new Barrel(BarrelType.WOOD);
            } else {
                return new Barrel(BarrelType.METAL);
            }
        } else {
            return new Tree();
        }
    }


    public String getMessage() {
        return null;
    }

}

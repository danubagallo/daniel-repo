package org.academiadecodigo.bootcamp;

public class Game {
    public GameObjects[] gameObjs;
    public SniperRifle sniper;
    public static int shotsFired = 0;

    public Game() {
    }

    public void createObjs(int numberOfObjects, int sniperDmg) {
        gameObjs = new GameObjects[numberOfObjects];
        for (int i = 0; i < gameObjs.length; i++) {
            gameObjs[i] = GameObjects.getNewObject();
        }
        sniper = new SniperRifle(sniperDmg);
    }

    public void start() {
        System.out.println("---- SNIPER GAME STARTED ----");
        for (int i = 0; i < gameObjs.length; i++) {
            if (gameObjs[i] instanceof Tree) {

            } else {
                while (((Enemy) gameObjs[i]).isDead() == false) {
                    if ((gameObjs[i] instanceof SoldierEnemy) || (gameObjs[i] instanceof ArmouredEnemy) || (gameObjs[i] instanceof Barrel)) {
                        sniper.shoot((Enemy) gameObjs[i]);
                    } else {
                    }
                }

            }

        }
        System.out.println("GAME OVER!! ALL TARGETS ELIMINATED. TOTAL SHOTS FIRED: " + shotsFired);

    }
}
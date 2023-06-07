package org.academiadecodigo.bootcamp;

public class SniperRifle {
    private int bulletDmg;

    public SniperRifle(int damage) {
        this.bulletDmg = damage;
    }

    public void shoot(Enemy zz) {
        while (zz.isDead() == false) {
            zz.hit(bulletDmg);
            Game.shotsFired++;
        }

    }

}

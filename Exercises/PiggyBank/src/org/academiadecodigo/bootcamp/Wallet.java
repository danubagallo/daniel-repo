package org.academiadecodigo.bootcamp;

public class Wallet {
    private double Cash;

    public Wallet() {
        this.Cash = 0;
    }

    public double getCash() {
        return Cash;
    }

    public double addCash(double x) {
        return Cash += x;
    }

    public double subtractCash(double x) {
        return Cash -= x;
    }

}

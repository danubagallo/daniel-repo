package org.academiadecodigo.bootcamp;

public class Bank {
    private double Money;

    public Bank() {
        this.Money = 0;
    }

    public double getMoney() {
        return Money;
    }

    public double addMoney(double x) {
        return Money += x;
    }

    public double subtractMoney(double x) {
        return Money -= x;
    }
}
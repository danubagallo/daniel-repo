package org.academiadecodigo.bootcamp;

public class Player {
    private String name;
    private Profession job;
    private Bank pBank;
    private Wallet pWallet;

    public Player(String name, Profession job) {
        this.name = name;
        this.job = job;
        this.pBank = new Bank();
        this.pWallet = new Wallet();
    }

    public String getName() {
        return name;
    }

    public double getPiggyBank() {
        return pBank.getMoney();
    }

    public double getCash() {
        return pWallet.getCash();
    }

    public double workSalary() {
        switch (job) {
            case Teacher:
                return pBank.addMoney(1500);
            case Engineer:
                return pBank.addMoney(2500);
            case Doctor:
                return pBank.addMoney(3500);
            case JediMaster:
                return pBank.addMoney(10000);
        }
        return pBank.getMoney();
    }

    public double groceryShopping() {
        pBank.subtractMoney(400);
        return pBank.getMoney();
    }

    public double withdrawCash(double x) {
        pBank.subtractMoney(x);
        pWallet.addCash(x);
        return pWallet.getCash();
    }

    public double payRent(double x) {
        return pWallet -= x;
    }
}
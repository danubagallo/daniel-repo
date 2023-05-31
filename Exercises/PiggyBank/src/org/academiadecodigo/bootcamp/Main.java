package org.academiadecodigo.bootcamp;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Daniel", Profession.JediMaster);
        Player player2 = new Player("Alfredo", Profession.Doctor);
        Player player3 = new Player("Fernando", Profession.Teacher);

        Bank bank1 = new Bank();

        System.out.println("--- RECEIVED SALARY ---");
        player1.workSalary();
        player2.workSalary();
        player3.workSalary();
        System.out.println("Current money in " + player1.getName() + " piggy bank: " + player1.getPiggyBank());
        System.out.println("Current money in " + player2.getName() + " piggy bank: " + player2.getPiggyBank());
        System.out.println("Current money in " + player3.getName() + " piggy bank: " + player3.getPiggyBank());

        System.out.println("--- WENT GROCERY SHOPPING ---");
        player1.groceryShopping();
        player2.groceryShopping();
        player3.groceryShopping();
        System.out.println("Current money in " + player1.getName() + " piggy bank: " + player1.getPiggyBank());
        System.out.println("Current money in " + player2.getName() + " piggy bank: " + player2.getPiggyBank());
        System.out.println("Current money in " + player3.getName() + " piggy bank: " + player3.getPiggyBank());

        System.out.println("--- RECEIVED SALARY AGAIN ---");
        player1.workSalary();
        player2.workSalary();
        player3.workSalary();
        System.out.println("Current money in " + player1.getName() + " piggy bank: " + player1.getPiggyBank() + " and current cash in wallet: " + player1.getCash());
        System.out.println("Current money in " + player2.getName() + " piggy bank: " + player2.getPiggyBank() + " and current cash in wallet: " + player2.getCash());
        System.out.println("Current money in " + player3.getName() + " piggy bank: " + player3.getPiggyBank() + " and current cash in wallet: " + player3.getCash());

        System.out.println("--- WITHDRAW SOME CASH ---");
        player1.withdrawCash(1600);
        player2.withdrawCash(600);
        player3.withdrawCash(200);
        System.out.println("Current money in " + player1.getName() + " piggy bank: " + player1.getPiggyBank() + " and current cash in wallet: " + player1.getCash());
        System.out.println("Current money in " + player2.getName() + " piggy bank: " + player2.getPiggyBank() + " and current cash in wallet: " + player2.getCash());
        System.out.println("Current money in " + player3.getName() + " piggy bank: " + player3.getPiggyBank() + " and current cash in wallet: " + player3.getCash());

        System.out.println("--- PAID RENT IN CASH ---");
        player1.payRent(300);
        player2.withdrawCash(600);
        player3.withdrawCash(200);
        System.out.println("Current money in " + player1.getName() + " piggy bank: " + player1.getPiggyBank() + " and current cash in wallet: " + player1.getCash());
        System.out.println("Current money in " + player2.getName() + " piggy bank: " + player2.getPiggyBank() + " and current cash in wallet: " + player2.getCash());
        System.out.println("Current money in " + player3.getName() + " piggy bank: " + player3.getPiggyBank() + " and current cash in wallet: " + player3.getCash());
    }
}

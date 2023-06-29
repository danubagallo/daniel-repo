package org.academiadecodigo.bootcamp;

public class Main {
    public static void main(String[] args) {

        Machine<String> machine = new Machine<>();

        Machine<Integer> machine2 = new Machine<>();

        System.out.println(machine.mono("Daniel", batata -> batata.toUpperCase()));

        System.out.println(machine.bi("Daniel", "Nozk", (batata,feijao) -> batata.toUpperCase() + " " + feijao.toUpperCase()));

        System.out.println(machine2.bi(2, 3, (batata, arroz) -> batata.intValue() + arroz.intValue()));

    }
}

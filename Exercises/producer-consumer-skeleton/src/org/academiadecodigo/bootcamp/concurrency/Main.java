package org.academiadecodigo.bootcamp.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;

public class Main {

    public static void main(String[] args) {

        BQueue<Integer> queue= new BQueue<>(10);

        Producer p1 = new Producer(queue,10, "Domino's");
        Thread t1 = new Thread(p1);
        t1.setName("p1");

        Producer p2 = new Producer(queue,10, "PizzaHut");
        Thread t2 = new Thread(p2);
        t2.setName("p2");

        Consumer c1 = new Consumer(queue, 10, "Ana");
        Thread t3 = new Thread(c1);
        t3.setName("c1");

        Consumer c2 = new Consumer(queue, 10, "Daniel");
        Thread t4 = new Thread(c2);
        t4.setName("c2");

        t3.start();
        t4.start();

        t1.start();
        t2.start();

    }

}


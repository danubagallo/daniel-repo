package org.academiadecodigo.bootcamp.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;

/**
 * Produces and stores integers into a blocking queue
 */
public class Producer implements Runnable {

    private final BQueue<Integer> queue;
    private int elementNum;
    private String name;


    /**
     * @param queue      the blocking queue to add elements to
     * @param elementNum the number of elements to produce
     */
    public Producer(BQueue queue, int elementNum, String name) {
        this.queue = queue;
        this.elementNum = elementNum;
        this.name = name;
    }

    @Override
    public void run() {



        while (elementNum > 0) {

            synchronized (queue) {
                queue.offer(new Pizza());



                System.out.println(Thread.currentThread().getName() + ": added one pizza to queue. Total pizzas in queue is " + queue.getSize());
                if (queue.getSize() == queue.getLimit()) {
                    System.out.println(Thread.currentThread().getName() + ":Pizza queue is now full.");
                }

            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            elementNum--;

        }
    }
}

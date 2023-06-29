package org.academiadecodigo.bootcamp.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;

/**
 * Consumer of integers from a blocking queue
 */
public class Consumer implements Runnable {

    private final BQueue<Integer> queue;
    private int elementNum;
    private String name;

    /**
     * @param queue      the blocking queue to consume elements from
     * @param elementNum the number of elements to consume
     */
    public Consumer(BQueue queue, int elementNum, String name) {
        this.queue = queue;
        this.elementNum = elementNum;
        this.name = name;
    }

    @Override
    public synchronized void run() {



        while (elementNum > 0) {

            synchronized (queue) {

                try {
                    queue.poll();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                System.out.println(Thread.currentThread().getName() + ": removed one pizza from queue. Total pizzas in queue is " + queue.getSize());
                if (queue.getSize() == 0) {
                    System.out.println(Thread.currentThread().getName() + ":Pizza queue is empty.");
                }


            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            elementNum--;


        }

    }
}

package org.academiadecodigo.bootcamp.concurrency.bqueue;

import org.academiadecodigo.bootcamp.concurrency.Pizza;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {

    private int limit;

    private Queue queue;

    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */
    public BQueue(int limit) {

        this.limit = limit;
        queue = new LinkedList();

    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param data the data to add to the queue
     */
    public synchronized void offer(Pizza data) {

        while (queue.size() >= limit) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        queue.add(data);
        notifyAll();

    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     *
     * @return the data from the head of the queue
     */
    public synchronized Pizza poll() throws InterruptedException {
        while (queue.size() <= 0) {
                wait();
        }
        Pizza pizza = (Pizza) queue.remove();

        notifyAll();
        return pizza;

    }

    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public synchronized int getSize() {

        return queue.size();

    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {

        return limit;

    }

}

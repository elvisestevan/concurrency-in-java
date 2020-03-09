package com.elvisestevan.blockingqueues;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final BlockingQueue<String> q;

    public Consumer(BlockingQueue<String> q) {
        this.q = q;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(q.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.elvisestevan.blockingqueues;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private final BlockingQueue<String> q;

    public Producer(BlockingQueue<String> q) {
        this.q = q;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String item = Long.toString(System.currentTimeMillis());
                System.out.println(String.format("Putting %s into the queue, remaining capacity: %d", item, q.remainingCapacity()));
                q.put(item);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

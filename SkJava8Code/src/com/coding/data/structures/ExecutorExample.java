package com.coding.data.structures;

import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        // Create a fixed thread pool executor
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        // Submit tasks to the executor
        for (int i = 0; i < 10; i++) {
            Runnable task = new Task(i);
            executor.execute(task);
        }
        
        // Shutdown the executor
        executor.shutdown();
    }
}

class Task implements Runnable {
    private int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
    }
}


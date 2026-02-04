package com.threads.app.Examples;

public class MainThread {
    public static void main(String[] args) {
        Thread T1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1 Executing " + i);
            }
        });

        Thread T2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 2 Executing " + i);
            }
        });

        T1.start();
        T2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread Executing " + i);
        }
    }

}

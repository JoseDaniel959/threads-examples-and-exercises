package com.threads.app.Examples;

public class JoinMethod {
    public static void main(String[] args) {
        Thread T1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("Thread 1 Executing " + i);
            }
        });

        T1.start();

        try {
            T1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Main Thread Executing Afeter Thread 1 " + i);
        }
    }
}

package com.threads.app.Examples;

public class DaemonThreadsExample {

    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            for (int i = 0; i < 200000000; i++) {
                System.out.println("Daemon Thread Executed " + i +" times");

            }
        });
        Thread userThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();
        userThread.start();

    }

}

package com.threads.app.Examples;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread T1 = new Thread(()->{
            for (int i = 0; i <= 50; i++) {
                System.out.println("T1 executing " + i);
            }
        });

        Thread T2 = new Thread(()->{
            for (int i = 0; i <= 50; i++) {
                System.out.println("T2 executing " + i);                
            }
        });

        System.out.println("Thread T1 Priority " + T1.getPriority());
        System.out.println("Thread T2 Priority " + T2.getPriority());

        T1.setPriority(2);
        T2.setPriority(10);
        
        System.out.println("New Priority of Thread T1 " + T1.getPriority());
        System.out.println("New Priority of Thread T2 " + T2.getPriority());
        

    }    


}


package com.threads.app.Examples;

import java.util.stream.IntStream;

public class ThreadUsingRunnable {

    public static void main(String args[]) {
        Thread printingNumbers = new Thread(new ThreadNumbers());
        Thread printingAlphabet = new Thread(new ThreadAlphabet());
        Thread lambdaThread = new Thread(() -> {
            IntStream.range(0, 50).forEach((number) -> System.out.println("thread  nubmers " + number));
        });
        printingNumbers.start();
        printingAlphabet.start();

    }

}

class ThreadNumbers implements Runnable {
    @Override
    public void run() {
        // using streams
        IntStream.range(0, 50).forEach((number) -> System.out.println("thread  nubmers " + number));

    }
}

class ThreadAlphabet implements Runnable {/*  */
    char[] alphabet = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    @Override
    public void run() {

        // using streams
        IntStream.range(0, alphabet.length)
                .forEach((index) -> System.out.println("thread alphabet " + alphabet[index]));

        // using a for loop
        // for (int i = 0; i < alphabet.length; i++) {
        // System.out.println("thread two " + alphabet[i]);

        // }
    }

    class ThreadNumbersExtendingClass extends Thread {
        @Override
        public void run() {
            // using streams
            IntStream.range(0, 50).forEach((number) -> System.out.println("thread  nubmers " + number));

        }
    }

}
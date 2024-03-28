package com.hoang.simple;

public class SimpleThread {
    public static void main(String[] args) {
        //Thread main -> Luong chinh
        System.out.println("Start");


//        --cách 1--
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("Thread 1:" + i);
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("Thread 2 : " + i);
                }
            }
        });
        t2.start();


        // cach 2
        new Thread(
                ()->{
                    for (int i = 0; i <100 ; i++) {
                        System.out.println("Thread 3: " + i);
                    }

                }
        ).start();

        System.out.println("Ends");
    }
}

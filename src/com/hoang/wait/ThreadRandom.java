package com.hoang.wait;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRandom extends Thread {
    SharedData sharedData;

    public ThreadRandom( SharedData sharedData){
        this.sharedData = sharedData;
    }

    public ThreadRandom(){

    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.println("T1>>" + i);
            synchronized (sharedData) {
                int rad = random.nextInt(100) + 1;
                sharedData.setRad(rad);
                System.out.println("Rad : " + rad);
                // trien kahi them
                // wait +> t2 chay
                try {
                    sharedData.notify();
                    sharedData.wait();
                } catch (InterruptedException e) {
                    Logger.getLogger(ThreadRandom.class.getName()).log(Level.SEVERE,null, e);
                }

            }

        }
        System.out.println( "T1 stop");


    }
}

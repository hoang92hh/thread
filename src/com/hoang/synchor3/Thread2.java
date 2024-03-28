package com.hoang.synchor3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread2 extends Thread {
    SharedData sharedData;

    public Thread2(SharedData sharedData){
        this.sharedData = sharedData;

    }

    @Override
    public void run() {
        while(sharedData.checkAvaiable()){
            synchronized (sharedData){
                sharedData.notifyAll();
                try {
                    while(sharedData.getIndex() !=2 && sharedData.checkAvaiable()){
                        sharedData.wait();
                    }

                } catch (InterruptedException e) {
                    Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE,null,e);
                }

                int rad = sharedData.getRad();
                if(rad %3 ==0){
                    rad *= rad;
                    System.out.println("T2 >> " + rad);
                }
                sharedData.setIndex(1);
            }

        }

        synchronized (sharedData){
            sharedData.notifyAll();
        }
    }
}

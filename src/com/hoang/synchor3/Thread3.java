package com.hoang.synchor3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread3 extends Thread{
    SharedData sharedData ;

    public Thread3( SharedData sharedData){
        this.sharedData = sharedData;

    }

    @Override
    public void run() {
        while(sharedData.checkAvaiable()){
            synchronized (sharedData) {
                sharedData.notifyAll();
                try {
                    while(sharedData.getIndex() !=3 && sharedData.checkAvaiable()){
                        sharedData.wait();
                    }

                } catch (InterruptedException e) {
                    Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE,null,e);
                }
                int rad = sharedData.getRad();
                if (rad % 2 == 0) {
                    if (rad % 4 == 0) {
                        System.out.println("So ngua nhien chia het cho 4");
                    } else System.out.println("so ngua nhien khong chia het cho 4");
                }else{
                    System.out.println("Khong Le");
                }
                sharedData.setIndex(1);
            }

        }

        synchronized (sharedData){
            sharedData.notifyAll();
        }
    }
}

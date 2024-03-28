package com.hoang.wait;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadSquare extends Thread {
    SharedData sharedData;

    public ThreadSquare (SharedData sharedData){
        this.sharedData = sharedData;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("T2>>" + i);
            synchronized (sharedData) {
                try {
                    sharedData.notifyAll();
                    sharedData.wait();
                } catch (InterruptedException e) {
                    Logger.getLogger(ThreadSquare.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            int rad = sharedData.getRad();
            rad *= rad;
            System.out.println("Squared Rad :" + rad);
        }

        System.out.println( "T2 stop");
        // khoi lenh danh thuc T1 khoi wait o vong thứ n , bỏi vì tại vòng n của T2 thì chương trình bị kết thúc
//        sharedData.notifyAll(); // cau lenh se loi khi T2 duoc chay truoc

        synchronized (sharedData){
            sharedData.notifyAll();
        }
    }
}

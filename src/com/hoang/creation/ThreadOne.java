package com.hoang.creation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("ThreadOne > " + i);
//            try {
////                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE,null,ex);
//            }
        }
        System.out.println("ket thuc thread One");
    }
}

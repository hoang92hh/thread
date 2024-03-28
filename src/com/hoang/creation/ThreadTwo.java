package com.hoang.creation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("ThreadTwo > " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }
}

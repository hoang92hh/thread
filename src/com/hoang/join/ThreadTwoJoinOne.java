package com.hoang.join;

import com.hoang.creation.ThreadOne;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadTwoJoinOne extends Thread {
    private ThreadOne threadOne;

    public ThreadTwoJoinOne (){};

    public ThreadTwoJoinOne(ThreadOne threadOne) {
        this.threadOne = threadOne;
    }

    @Override
    public void run() {
        System.out.println("t2 is running");
        try {
            System.out.println("chuan bi join t1 into t2");
            threadOne.join();
            System.out.println("t1 is finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

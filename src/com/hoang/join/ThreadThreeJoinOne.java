package com.hoang.join;

import com.hoang.creation.ThreadOne;

public class ThreadThreeJoinOne extends Thread {
    private ThreadOne threadOne ;

    public ThreadThreeJoinOne (ThreadOne threadOne){
        this.threadOne = threadOne;
    }


    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            System.out.println("ThreadThree >> " + i );
            if(i==5){
                try {
                    threadOne.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Ket thuc thread Three");
    }
}

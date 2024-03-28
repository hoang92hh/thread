package com.hoang.synchor3;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 extends Thread{
    SharedData sharedData ;

    public Thread1(SharedData sharedData){
        this.sharedData = sharedData;

    }

    @Override
    public void run() {
        Random random = new Random();

        while (sharedData.checkAvaiable()){

            synchronized (sharedData) {
                int rad = random.nextInt(100) + 1;
                sharedData.setRad(rad);
                sharedData.plus(rad);
                System.out.println(" T1 >>" + rad);

                // thiet lap luong nao tiep theo duoc chay truoc  khi danh thuc tat cac
                if (rad%3 ==0){
                    sharedData.setIndex(2);
                }else if(rad % 2 ==0 ){
                    sharedData.setIndex(3);
                }else {
                    sharedData.setIndex(3);
                }

                sharedData.notifyAll();

                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        }
    }
}

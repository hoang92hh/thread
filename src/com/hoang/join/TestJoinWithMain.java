package com.hoang.join;

import com.hoang.creation.ThreadOne;
import com.hoang.creation.ThreadTwo;

public class TestJoinWithMain {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("The start of Thread main"); // chi co thread main hoạt dong

        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        ThreadTwo t2 = new ThreadTwo();
        Thread threadTwo = new Thread(t2);
        threadTwo.start();


        //Tai thoi diem nay co den 3 luong chay song song

        //noi luong
        System.out.println("Chuan bi join 1 vao thread main");
        threadOne.join();//threadOne chay xong moi tiep tục chay logic cua Thread main
        System.out.println("Tiep tuc quay tro lai thread main sau khi thread one thuc hien xong");
        // tai thoi diem chi con 2 luong chay song song la thread 2 va thread main chay song song.
        System.out.println("Chuan bi thuc hien join thread 2 to thread main");
        threadTwo.join();

        System.out.println("The end of Thread main");

    }
}

package com.hoang.join;


import com.hoang.creation.ThreadOne;
import com.hoang.creation.ThreadTwo;

public class TestJoinThreadWithThread {

    public static void main(String[] args) {

        System.out.println("Thread Main Start");

        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        ThreadTwoJoinOne threadTwo = new ThreadTwoJoinOne(threadOne);
        threadTwo.start();

        System.out.println("Thread Main End");

        //muon noi luong t1 vao t2 thi can phai dat khoi lenh threadOne.join() trong class cua Thread two
        // vi vay can phai dieu chinh lai thuoc tinh cua ThreadTwo

    }
}

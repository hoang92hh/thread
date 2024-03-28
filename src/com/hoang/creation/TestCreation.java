package com.hoang.creation;

public class TestCreation {
    public static void main(String[] args) {
        ThreadOne  threadOne = new ThreadOne();
        threadOne.start();



        ThreadTwo t2 = new ThreadTwo();
        Thread threadTwo = new Thread(t2);
        threadTwo.start();

        ThreadTwo t22 = new ThreadTwo();
        new Thread(t22).start();
    }


}

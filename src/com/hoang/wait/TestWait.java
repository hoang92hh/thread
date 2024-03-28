package com.hoang.wait;

public class TestWait {

    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        ThreadRandom threadRandom = new ThreadRandom(sharedData);
        ThreadSquare threadSquare = new ThreadSquare(sharedData);

        threadSquare.start();
        threadRandom.start();


    }
}

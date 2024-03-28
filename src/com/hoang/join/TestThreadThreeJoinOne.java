package com.hoang.join;

import com.hoang.creation.ThreadOne;

public class TestThreadThreeJoinOne {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadThreeJoinOne threadThree = new ThreadThreeJoinOne(threadOne);

         threadOne.start();
         threadThree.start();

    }
}

package com.hoang.synchor3;

public class SharedData {
    private int rad;

    private int total;

    private int index;
    // index 1, 2, 3
    // tuong ung Thread 1, Thread 2, Thread 3

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void plus(int value) {
        total += value;
    }

    public boolean checkAvaiable() {
        return total<200;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
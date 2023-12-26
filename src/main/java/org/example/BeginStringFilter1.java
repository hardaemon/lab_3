package org.example;

public class BeginStringFilter1 implements Filter {
    private int coint;
    BeginStringFilter1(int coint) {
        this.coint = coint;
    }
    public boolean apply(String str) {
        if (str.length() <= coint) return true;
        else return false;
    }
}


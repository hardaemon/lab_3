package org.example;

public class BeginStringFilter implements Filter {
    private String pattern;
    BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }
    public boolean apply(String str) {
        String[] strArr = str.split(" ", 2);
        if (strArr[0].equals(pattern)) return true;
        else return false;
    }
}

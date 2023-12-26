package org.example;
import java.util.ArrayList;
import java.util.List;

public class BeginStringFilter2 implements Filter {
    private String string;
    BeginStringFilter2(String string) {
        this.string = string;
    }
    public boolean apply(String str) {
        if (str.startsWith(string)) return true;
        return false;
    }
}

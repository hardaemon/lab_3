package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class BeginStringFilterTests {
    @Test
    public void TestBeginStringFilter() {
        String str = "Мама мыла раму";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");
        boolean res1 = filter1.apply(str); // результат — true
        boolean res2 = filter2.apply(str); // результат — false
        assertTrue(res1);
        assertFalse(res2);
    }
    @Test
    public void TestBeginStringFilter1() {
        //кол-во символов не больше числа
        String str1 = "Hello world!";
        String str2 = "HelloHelloHelloHello";
        BeginStringFilter1 filter = new BeginStringFilter1(15);
        boolean res1 = filter.apply(str1); // результат — true
        boolean res2 = filter.apply(str2); // результат — false
        assertTrue(res1);
        assertFalse(res2);
    }
    @Test
    public void TestBeginStringFilter2() {
        //начинается ли с подстроки строка
        String str = "Hello world!";
        BeginStringFilter2 filter1 = new BeginStringFilter2("Hel");
        BeginStringFilter2 filter2 = new BeginStringFilter2("like");
        boolean res1 = filter1.apply(str); // результат — true
        boolean res2 = filter2.apply(str); // результат — false
        assertTrue(res1);
        assertFalse(res2);
    }
}

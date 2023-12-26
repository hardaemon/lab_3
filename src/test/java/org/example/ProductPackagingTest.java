package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductPackagingTest {
    @Test
    public void TestProductPackaging() {
        String name = "one";
        int weight = 1;
        ProductPackaging PP = new ProductPackaging(name,weight);
        assertEquals(name, PP.getName());
        assertEquals(weight, PP.getWeight());
    }
    @Test
    public void TestEquals() {
        String name = "one";
        int weight = 1;
        ProductPackaging PP = new ProductPackaging(name,weight);
        //проверка на true
        ProductPackaging PPCopy = new ProductPackaging(name,weight);
        assertTrue(PP.equals(PPCopy));
        //проверка на false
        String nameFalse = "two";
        int weightFalse = 2;
        ProductPackaging PPCopyFalse = new ProductPackaging(nameFalse,weightFalse);
        assertFalse(PP.equals(PPCopyFalse));
    }
    @Test
    public void TestHashCode() {
        String name = "one";
        int weight = 1;
        ProductPackaging PP = new ProductPackaging(name,weight);
        //проверка на true
        ProductPackaging PPCopy = new ProductPackaging(name,weight);
        assertTrue(PP.hashCode() == PPCopy.hashCode());
        //проверка на false
        String nameFalse = "two";
        int weightFalse = 2;
        ProductPackaging PPCopyFalse = new ProductPackaging(nameFalse,weightFalse);
        assertFalse(PP.hashCode() == PPCopyFalse.hashCode());
    }
    @Test
    public void TestToString() {
        String name = "one";
        int weight = 1;
        ProductPackaging PP = new ProductPackaging(name,weight);
        String expected = "Упаковка{name='one', weight=1}";
        assertEquals(expected, PP.toString());
        System.out.println(PP.toString());
    }
}
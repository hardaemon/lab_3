package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class PieceProductTest {
    @Test
    public void TestPieceProduct() {
    String name = "one";
    String description = "lalala";
    int weight = 1;
    PieceProduct PP = new PieceProduct(name, description, weight);
    assertEquals(name, PP.getName());
    assertEquals(description, PP.getDescription());
    assertEquals(weight, PP.getWeight());
    }
    @Test
    public void TestEquals() {
        String name = "one";
        String description = "lalala";
        int weight = 1;
        PieceProduct PP = new PieceProduct(name, description, weight);
        //проверка на true
        PieceProduct PPCopy = new PieceProduct(name, description, weight);
        assertTrue(PP.equals(PPCopy));
        //проверка на false
        String nameFalse = "two";
        String descriptionFalse = "lal";
        int weightFalse = 2;
        PieceProduct PPCopyFalse = new PieceProduct(nameFalse, descriptionFalse, weightFalse);
        assertFalse(PP.equals(PPCopyFalse));
    }
    @Test
    public void TestHashCode() {
        String name = "one";
        String description = "lalala";
        int weight = 1;
        PieceProduct PP = new PieceProduct(name, description, weight);
        //проверка на true
        PieceProduct PPCopy = new PieceProduct(name, description, weight);
        assertTrue(PP.hashCode() == PPCopy.hashCode());
        //проверка на false
        String nameFalse = "two";
        String descriptionFalse = "lal";
        int weightFalse = 2;
        PieceProduct PPCopyFalse = new PieceProduct(nameFalse, descriptionFalse, weightFalse);
        assertFalse(PP.hashCode() == PPCopyFalse.hashCode());
    }
    @Test
    public void TestToString() {
        String name = "one";
        String description = "lalala";
        int weight = 1;
        PieceProduct PP = new PieceProduct(name, description, weight);
        String expected = "Штучный товар{name='one', description='lalala', weight=1}";
        assertEquals(expected, PP.toString());
        System.out.println(PP.toString());
    }
}
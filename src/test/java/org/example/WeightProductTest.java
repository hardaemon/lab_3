package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeightProductTest {
    @Test
    public void TestWeightProduct() {
        String name = "one";
        String description = "lalala";
        WeightProduct prod = new WeightProduct(name, description);
        assertEquals(name, prod.getName());
        assertEquals(description, prod.getDescription());
    }
    @Test
    public void TestEquals() {
        String name = "one";
        String description = "lalala";
        WeightProduct prod = new WeightProduct(name, description);
        //проверка на true
        WeightProduct prodCopy = new WeightProduct(name, description);
        assertTrue(prod.equals(prodCopy));
        //проверка на false
        String nameFalse = "two";
        String descriptionFalse = "lal";
        WeightProduct prodCopyFalse = new WeightProduct(nameFalse, descriptionFalse);
        assertFalse(prod.equals(prodCopyFalse));
    }
    @Test
    public void TestHashCode() {
        String name = "one";
        String description = "lalala";
        WeightProduct prod = new WeightProduct(name, description);
        //проверка на true
        WeightProduct prodCopy = new WeightProduct(name, description);
        assertTrue(prod.hashCode() == prodCopy.hashCode());
        //проверка на false
        String nameFalse = "two";
        String descriptionFalse = "lal";
        WeightProduct prodCopyFalse = new WeightProduct(nameFalse, descriptionFalse);
        assertFalse(prod.hashCode() == prodCopyFalse.hashCode());
    }
    @Test
    public void TestToString() {
        String name = "one";
        String description = "lalala";
        WeightProduct prod = new WeightProduct(name, description);
        String expected = "Весовой товар{name='one', description='lalala'}";
        assertEquals(expected, prod.toString());
        System.out.println(prod.toString());
    }
}
package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {
    @Test
    public void TestProduct() {
        String name = "one";
        String description = "lalala";
        Product prod = new Product(name, description);
        assertEquals(name, prod.getName());
        assertEquals(description, prod.getDescription());
    }
    @Test
    public void TestEquals() {
        String name = "one";
        String description = "lalala";
        Product prod = new Product(name,description);
        //проверка на true
        Product prodCopy = new Product(name,description);
        assertTrue(prod.equals(prodCopy));
        //проверка на false
        String nameFalse = "two";
        String descriptionFalse = "lal";
        Product prodCopyFalse = new Product(nameFalse,descriptionFalse);
        assertFalse(prod.equals(prodCopyFalse));
    }
    @Test
    public void TestHashCode() {
        String name = "one";
        String description = "lalala";
        Product prod = new Product(name,description);
        //проверка на true
        Product prodCopy = new Product(name,description);
        assertTrue(prod.hashCode() == prodCopy.hashCode());
        //проверка на false
        String nameFalse = "two";
        String descriptionFalse = "lal";
        Product prodCopyFalse = new Product(nameFalse,descriptionFalse);
        assertFalse(prod.hashCode() == prodCopyFalse.hashCode());
    }
    @Test
    public void TestToString() {
        String name = "one";
        String description = "lalala";
        Product prod = new Product(name,description);
        String expected = "Товар{name='one', description='lalala'}";
        assertEquals(expected, prod.toString());
        System.out.println(prod.toString());
    }
}
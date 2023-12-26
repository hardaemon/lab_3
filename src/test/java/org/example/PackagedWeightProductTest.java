package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class PackagedWeightProductTest {
    @Test
    public void TestPackagedWeightProductAndNetWeight() {
        WeightProduct wProd = new WeightProduct("one", "lalala");
        int countWeight = 2;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedWeightProduct pWProd = new PackagedWeightProduct(wProd, countWeight, prodP);
        assertEquals(wProd, pWProd.getWProd());
        assertEquals(countWeight, pWProd.netWeight());
        assertEquals(prodP, pWProd.getProdP());
    }
    @Test
    public void TestGrossWeight() {
        WeightProduct wProd = new WeightProduct("one", "lalala");
        int countWeight = 2;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedWeightProduct pWProd = new PackagedWeightProduct(wProd, countWeight, prodP);
        assertEquals(3, pWProd.grossWeight());
    }
    @Test
    public void TestEquals() {
        WeightProduct wProd = new WeightProduct("one", "lalala");
        int countWeight = 2;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedWeightProduct pWProd = new PackagedWeightProduct(wProd, countWeight, prodP);
        //проверка на true
        PackagedWeightProduct pWProdCope = new PackagedWeightProduct(wProd, countWeight, prodP);
        assertTrue(pWProd.equals(pWProdCope));
        //проверка на false
        WeightProduct wProdFalse = new WeightProduct("two", "lal");
        int countWeightFalse = 5;
        ProductPackaging prodPFalse = new ProductPackaging("pa", 3);
        PackagedWeightProduct pWProdFalse = new PackagedWeightProduct(wProdFalse, countWeightFalse, prodPFalse);
        assertFalse(pWProd.equals(pWProdFalse));
    }
    @Test
    public void TestHashCode() {
        WeightProduct wProd = new WeightProduct("one", "lalala");
        int countWeight = 2;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedWeightProduct pWProd = new PackagedWeightProduct(wProd, countWeight, prodP);
        //проверка на true
        PackagedWeightProduct pWProdCope = new PackagedWeightProduct(wProd, countWeight, prodP);
        assertTrue(pWProd.hashCode() == pWProdCope.hashCode());
        //проверка на false
        WeightProduct wProdFalse = new WeightProduct("two", "lal");
        int countWeightFalse = 5;
        ProductPackaging prodPFalse = new ProductPackaging("pa", 3);
        PackagedWeightProduct pWProdFalse = new PackagedWeightProduct(wProdFalse, countWeightFalse, prodPFalse);
        assertFalse(pWProd.hashCode() == pWProdFalse.hashCode());
    }
    @Test
    public void TestToString() {
        WeightProduct wProd = new WeightProduct("one", "lalala");
        int countWeight = 2;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedWeightProduct pWProd = new PackagedWeightProduct(wProd, countWeight, prodP);
        String expected = "Упакованный весовой товар{Весовой товар{name='one', description='lalala'}, Количество=2, Упаковка{name='pack', weight=1}}";
        assertEquals(expected, pWProd.toString());
        System.out.println(pWProd.toString());
    }
}
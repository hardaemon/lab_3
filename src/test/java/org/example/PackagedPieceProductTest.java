package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class PackagedPieceProductTest {
    @Test
    public void TestPackagedPieceProductAndGetCount () {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);
        assertEquals(pProd, pProdP.getPProd());
        assertEquals(count, pProdP.getCount());
        assertEquals(prodP, pProdP.getProdP());
    }
    @Test
    public void TestNewWeight() {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);
        assertEquals(10, pProdP.netWeight());
    }
    @Test
    public void TestGrossWeight() {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);
        assertEquals(11, pProdP.grossWeight());
    }
    @Test
    public void TestEquals() {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);
        //true
        PackagedPieceProduct pCopy = new PackagedPieceProduct(pProd, count, prodP);
        assertTrue(pProdP.equals(pCopy));
        //false
        PieceProduct pProdFalse = new PieceProduct("two", "lal", 4);
        int countFalse = 7;
        ProductPackaging prodPFalse = new ProductPackaging("pa", 2);
        PackagedPieceProduct pProdPFalse = new PackagedPieceProduct(pProdFalse, countFalse, prodPFalse);
        assertFalse(pProdP.equals(pProdPFalse));
    }
    @Test
    public void TestHashCode() {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);
        //true
        PackagedPieceProduct pCopy = new PackagedPieceProduct(pProd, count, prodP);
        assertTrue(pProdP.hashCode() == pCopy.hashCode());
        //false
        PieceProduct pProdFalse = new PieceProduct("two", "lal", 4);
        int countFalse = 7;
        ProductPackaging prodPFalse = new ProductPackaging("pa", 2);
        PackagedPieceProduct pProdPFalse = new PackagedPieceProduct(pProdFalse, countFalse, prodPFalse);
        assertFalse(pProdP.hashCode() == pProdPFalse.hashCode());
    }
    @Test
    public void TestToString() {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);
        String expected = "Упакованный штучный товар{Штучный товар{name='one', description='lalala', weight=2}, Количество=5, Упаковка{name='pack', weight=1}}";
        assertEquals(expected, pProdP.toString());
        System.out.println(pProdP.toString());
    }
}
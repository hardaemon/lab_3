package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class BatchOfProductsTest {
    @Test
    public void TestBatchOfProducts() {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);

        WeightProduct wProd = new WeightProduct("two", "lal");
        int countWeight = 2;
        ProductPackaging prodP2 = new ProductPackaging("packkk", 3);
        PackagedWeightProduct pWProd = new PackagedWeightProduct(wProd, countWeight, prodP2);

        Object[] arr = new Object[2];
        arr[0] = pProdP;
        arr[1] = pWProd;

        BatchOfProducts batch = new BatchOfProducts("la", arr);
        assertEquals("la", batch.getDescription());
        assertArrayEquals(arr, batch.getArr());
    }
    @Test
    public void TestGrossWeightAll() {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);

        WeightProduct wProd = new WeightProduct("two", "lal");
        int countWeight = 2;
        ProductPackaging prodP2 = new ProductPackaging("packkk", 3);
        PackagedWeightProduct pWProd = new PackagedWeightProduct(wProd, countWeight, prodP2);

        Object[] arr = new Object[2];
        arr[0] = pProdP;
        arr[1] = pWProd;

        BatchOfProducts batch = new BatchOfProducts("la", arr);

        assertEquals(pProdP.grossWeight() + pWProd.grossWeight(), batch.GrossWeightAll());
    }
    @Test
    public void TestEquals() {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);

        WeightProduct wProd = new WeightProduct("two", "lal");
        int countWeight = 2;
        ProductPackaging prodP2 = new ProductPackaging("packkk", 3);
        PackagedWeightProduct pWProd = new PackagedWeightProduct(wProd, countWeight, prodP2);

        Object[] arr = new Object[2];
        arr[0] = pProdP;
        arr[1] = pWProd;

        BatchOfProducts batch = new BatchOfProducts("la", arr);

        BatchOfProducts batchTrue = new BatchOfProducts("la", arr);
        assertTrue(batch.equals(batchTrue));

        PieceProduct pProdFalse = new PieceProduct("oneeee", "lalalaaaa", 3);
        int countFalse = 6;
        ProductPackaging prodPFalse = new ProductPackaging("packkk", 3);
        PackagedPieceProduct pProdPFalse = new PackagedPieceProduct(pProdFalse, countFalse, prodPFalse);

        Object[] arrFalse = new Object[2];
        arr[0] = pProdPFalse;
        arr[1] = pWProd;

        BatchOfProducts batchFalse = new BatchOfProducts("lo", arrFalse);
        assertFalse(batch.equals(batchFalse));
    }
    @Test
    public void TestHashCode() {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);

        WeightProduct wProd = new WeightProduct("two", "lal");
        int countWeight = 2;
        ProductPackaging prodP2 = new ProductPackaging("packkk", 3);
        PackagedWeightProduct pWProd = new PackagedWeightProduct(wProd, countWeight, prodP2);

        Object[] arr = new Object[2];
        arr[0] = pProdP;
        arr[1] = pWProd;

        BatchOfProducts batch = new BatchOfProducts("la", arr);

        BatchOfProducts batchTrue = new BatchOfProducts("la", arr);
        assertTrue(batch.hashCode() == batchTrue.hashCode());

        PieceProduct pProdFalse = new PieceProduct("oneeee", "lalalaaaa", 3);
        int countFalse = 6;
        ProductPackaging prodPFalse = new ProductPackaging("packkk", 3);
        PackagedPieceProduct pProdPFalse = new PackagedPieceProduct(pProdFalse, countFalse, prodPFalse);

        Object[] arrFalse = new Object[2];
        arr[0] = pProdPFalse;
        arr[1] = pWProd;

        BatchOfProducts batchFalse = new BatchOfProducts("lo", arrFalse);
        assertFalse(batch.hashCode() == batchFalse.hashCode());
    }
    @Test
    public void TestToString() {
        PieceProduct pProd = new PieceProduct("one", "lalala", 2);
        int count = 5;
        ProductPackaging prodP = new ProductPackaging("pack", 1);
        PackagedPieceProduct pProdP = new PackagedPieceProduct(pProd, count, prodP);

        WeightProduct wProd = new WeightProduct("two", "lal");
        int countWeight = 2;
        ProductPackaging prodP2 = new ProductPackaging("packkk", 3);
        PackagedWeightProduct pWProd = new PackagedWeightProduct(wProd, countWeight, prodP2);

        Object[] arr = new Object[2];
        arr[0] = pProdP;
        arr[1] = pWProd;

        BatchOfProducts batch = new BatchOfProducts("la", arr);

        String expected = "Партия товаров{описание='la', товары=[Упакованный штучный товар{Штучный товар{name='one', description='lalala', weight=2}, Количество=5, Упаковка{name='pack', weight=1}}, Упакованный весовой товар{Весовой товар{name='two', description='lal'}, Количество=2, Упаковка{name='packkk', weight=3}}]}";
        assertEquals(expected, batch.toString());
        System.out.println(batch.toString());
    }
}
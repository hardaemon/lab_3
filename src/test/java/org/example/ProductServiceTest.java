package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductServiceTest {
    @Test
    public void TestCountByFilter() {
        //создаем объект BatchOfProducts
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

        //создаем объект ProductService
        ProductService PS = new ProductService();
        //создание объекта BeginStringFilter
        BeginStringFilter begin = new BeginStringFilter("one");
        //запуск метода и сравнение
        assertEquals(1, PS.countByFilter(batch, begin));

        //создаем объект ProductService
        ProductService PS1 = new ProductService();
        //создание объекта BeginStringFilter1
        BeginStringFilter1 begin1 = new BeginStringFilter1(3);
        //запуск метода и сравнение
        assertEquals(2, PS1.countByFilter(batch, begin1));

        //создаем объект ProductService
        ProductService PS2 = new ProductService();
        //создание объекта BeginStringFilter2
        BeginStringFilter2 begin2 = new BeginStringFilter2("o");
        //запуск метода и сравнение
        assertEquals(1, PS2.countByFilter(batch, begin2));
    }
}
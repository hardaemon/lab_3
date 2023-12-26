package org.example;
import java.util.Arrays;
import java.util.Objects;

public class BatchOfProducts {
    private String description;
    private Object[] arr;
    private int countAll = 0;
    BatchOfProducts(String description, Object[] arrs) {
        Object temp;
        this.description = description;
        arr = new Object[arrs.length];
        for (int i = 0; i < arrs.length; i++) {
            temp = arrs[i];
            arr[i] = temp;
        }
    }
    public int GrossWeightAll() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof PackagedPieceProduct) {
                countAll+=((PackagedPieceProduct) arr[i]).grossWeight();
            }
            if (arr[i] instanceof PackagedWeightProduct) {
                countAll+=((PackagedWeightProduct) arr[i]).grossWeight();
            }
        }
        return countAll;
    }
    public String getDescription() { return description; }
    public Object[] getArr() { return arr; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BatchOfProducts that)) return false;
        return Objects.equals(description, that.description) && Arrays.equals(arr, that.arr);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }
    @Override
    public String toString() {
        return "Партия товаров{" +
                "описание='" + description + '\'' +
                ", товары=" + Arrays.toString(arr) +
                '}';
    }
}

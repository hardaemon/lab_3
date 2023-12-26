package org.example;
import java.util.Objects;

public class PackagedWeightProduct {
    private WeightProduct wProd;
    private int countWeight;
    private ProductPackaging prodP;
    PackagedWeightProduct(WeightProduct wProd, int countWeight, ProductPackaging prodP) {
        this.wProd = wProd;
        this.countWeight = countWeight;
        this.prodP = prodP;
    }
    public int netWeight() { return countWeight; }
    public int grossWeight() { return prodP.getWeight() + countWeight; }

    public WeightProduct getWProd() { return wProd; }
    public ProductPackaging getProdP() { return prodP; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackagedWeightProduct that)) return false;
        return countWeight == that.countWeight && Objects.equals(wProd, that.wProd) && Objects.equals(prodP, that.prodP);
    }
    @Override
    public int hashCode() { return Objects.hash(wProd, countWeight, prodP); }
    @Override
    public String toString() {
        return "Упакованный весовой товар{"
                + wProd.toString() +
                ", Количество=" + countWeight +
                ", " + prodP.toString() +
                '}';
    }
}

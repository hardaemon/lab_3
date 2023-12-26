package org.example;
import java.util.Objects;

public class PackagedPieceProduct {
    private PieceProduct pProd;
    private int count;
    private ProductPackaging prodP;
    PackagedPieceProduct(PieceProduct pProd, int count, ProductPackaging prodP) {
        this.pProd = pProd;
        this.count = count;
        this.prodP = prodP;
    }
    public int getCount() { return count; };
    public int netWeight() { return count * pProd.getWeight(); }
    public int grossWeight() { return prodP.getWeight() + (count * pProd.getWeight()); }

    public PieceProduct getPProd() { return pProd; }
    public ProductPackaging getProdP() { return prodP; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackagedPieceProduct that)) return false;
        return count == that.count && Objects.equals(pProd, that.pProd) && Objects.equals(prodP, that.prodP);
    }
    @Override
    public int hashCode() { return Objects.hash(pProd, count, prodP); }
    @Override
    public String toString() {
        return "Упакованный штучный товар{"
                + pProd.toString() +
                ", Количество=" + count + ", "
                + prodP.toString() +
                '}';
    }
}

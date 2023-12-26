package org.example;
import java.util.Objects;

public class PieceProduct extends Product {
    private int weight;
    PieceProduct(String name, String description, int weight) {
        super(name, description);
        this.weight = weight;
    }

    public int getWeight() { return weight; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PieceProduct that)) return false;
        return weight == that.weight && Objects.equals(getName(), that.getName()) && Objects.equals(getDescription(), that.getDescription());
    }
    @Override
    public int hashCode() { return Objects.hash(getName(), getDescription(), weight); }
    @Override
    public String toString() {
        return "Штучный товар{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", weight=" + weight +
                '}';
    }
}
package org.example;
import java.util.Objects;

public class ProductPackaging {
    private String name;
    private int weight;
    ProductPackaging(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return name; }
    public int getWeight() { return weight; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPackaging that)) return false;
        return weight == that.weight && Objects.equals(name, that.name);
    }
    @Override
    public int hashCode() { return Objects.hash(name, weight); }
    @Override
    public String toString() {
        return "Упаковка{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
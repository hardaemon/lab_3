package org.example;
import java.util.Objects;

public class WeightProduct extends Product {
    WeightProduct(String name, String description) {
        super(name, description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeightProduct weightProduct)) return false;
        return Objects.equals(getName(), weightProduct.getName()) && Objects.equals(getDescription(), weightProduct.getDescription());
    }
    @Override
    public int hashCode() { return Objects.hash(getName(), getDescription()); }
    @Override
    public String toString() {
        return "Весовой товар{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}
package org.example;
import java.util.Objects;

public class Product {
    private String name;
    private String description;
    Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(name, product.name) && Objects.equals(description, product.description);
    }
    @Override
    public int hashCode() { return Objects.hash(name, description); }
    @Override
    public String toString() {
        return "Товар{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
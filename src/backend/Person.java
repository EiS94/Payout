package backend;

import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private double payed;
    private List<Product> products;
    private Style style;

    public Person(String name, double payed, List<Product> products) {
        this.name = name;
        this.payed = payed;
        this.products = products;
        this.style = null;
    }

    public Person(String name, double payed) {
        this.name = name;
        this.payed = payed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayed() {
        return payed;
    }

    public void setPayed(double payed) {
        this.payed = payed;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



}

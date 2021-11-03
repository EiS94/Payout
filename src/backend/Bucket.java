package backend;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Bucket {

    private List<Product> products;
    private List<Person> persons;
    private List<Person> payers;
    private List<Person> receivers;

    public Bucket(List<Product> products, List<Person> persons) {
        this.products = products;
        this.persons = persons;
        this.payers = new LinkedList<>();
        this.receivers = new LinkedList<>();
    }

    public Bucket(Product... products) {
        this.products = new LinkedList<>();
        this.products.addAll(Arrays.asList(products));
        this.persons = new LinkedList<>();
        this.payers = new LinkedList<>();
        this.receivers = new LinkedList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void addPersons(Person... persons) {
        for (Person person : persons) addPerson(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }

    public void removePersons(Person... persons) {
        for (Person person : persons) removePerson(person);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(Product... products) {
        for (Product product : products) addProduct(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void removeProducts(Product... products) {
        for (Product product : products) removeProduct(product);
    }



}

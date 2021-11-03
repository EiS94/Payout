package backend;

import java.util.LinkedList;
import java.util.List;

public class Product {

    private String name;
    private double price;
    private Person payer;
    private List<Person> personsThatHaveToPayFor;

    public Product(String name, double price, Person payer) {
        this.name = name;
        this.price = price;
        this.payer = payer;
        this.personsThatHaveToPayFor = new LinkedList<>();
    }

    public Product(String name, double price, Person payer, List<Person> personsThatHaveToPayFor) {
        this.name = name;
        this.price = price;
        this.payer = payer;
        this.personsThatHaveToPayFor = personsThatHaveToPayFor;
    }

    public void addPerson(Person person) {
        personsThatHaveToPayFor.add(person);
    }

    public void addPersons(Person... persons) {
        for (Person person : persons) {
            addPerson(person);
        }
    }

    public void removePerson(Person person) {
        personsThatHaveToPayFor.remove(person);
    }

    public void removePersons(Person... persons) {
        for (Person person : persons) {
            removePerson(person);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPayer() {
        return payer;
    }

    public void setPayer(Person payer) {
        this.payer = payer;
    }

    public List<Person> getPersonsThatHaveToPayFor() {
        return personsThatHaveToPayFor;
    }

    public void setPersonsThatHaveToPayFor(List<Person> personsThatHaveToPayFor) {
        this.personsThatHaveToPayFor = personsThatHaveToPayFor;
    }
}

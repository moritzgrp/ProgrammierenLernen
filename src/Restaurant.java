import javax.naming.Name;
import javax.xml.namespace.QName;

public class Restaurant {
    protected String name;
    protected Adress adress;
    protected PizzaOven pizzaOven;
    protected Person owner;

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }
    public Restaurant(String name, Adress adress, PizzaOven pizzaOven) {
        this.name = name;
        this.adress = adress;
        this.pizzaOven = pizzaOven;
    }
    public Restaurant(String name, Adress adress, PizzaOven pizzaOven, Person owner) {
        this.name = name;
        this.adress = adress;
        this.pizzaOven = pizzaOven;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }
    public String rename () {
        return getName();
    }
    public Adress relocate () {
        return getAdress();
    }
    public PizzaOven installOven () {
        return pizzaOven;
    }

}
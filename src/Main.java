import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Adress zuhause = new Adress("Bomgarstraße","Hannover","43");
        System.out.println(zuhause);

        Person pers = new Person("Moritz","Grupe");
        System.out.println(pers);
        PizzaOven ofen = new PizzaOven(200);
        Pizza piz = new Pizza(32);

        Restaurant rest = new Restaurant("Pizzaladen",zuhause,ofen,pers);
        System.out.println(rest.name + rest.adress + rest.pizzaOven.temperature + rest.owner);
        System.out.println(piz.cooked);
        ofen.insert(piz);
        ofen.takeOut();
        System.out.println(piz.cooked);
        SecretPizzaSauce pizsau = new SecretPizzaSauce();

        Topping top = new Chili(4);
        System.out.println(top.anzahl);

        Topping top2 = new Sucuk(5);
        System.out.println(top.anzahl);
        System.out.println("hehe");
    }
}

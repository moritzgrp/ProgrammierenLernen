import java.sql.SQLOutput;

public class PizzaOven {
    protected double temperature;
    protected Pizza baking;

    public PizzaOven(double temperature) {
        this.temperature = temperature;
    }
    public static PizzaOven create() {
     return new PizzaOven(create().getTemperature());
    }
    public void increaseTempereatur (double temperature){
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
    public void insert (Pizza pizza) {
        baking = pizza;
        baking.cook();
    }
    public Pizza takeOut () {
        baking.isCooked();
        return baking;
    }
}

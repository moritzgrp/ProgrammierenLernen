public class Pizza {
    protected double diameter;
    protected boolean cooked;
    protected SecretPizzaSauce sauce;

    public Pizza(double diameter) {
        this.diameter = diameter;
    }
    public void cook () {
        cooked = true;
        isCooked();
    }
    public  boolean isCooked () {
        return cooked;
    }
    public void addPizzaSauce (SecretPizzaSauce sauce) {
        this.sauce = sauce;
    }
}

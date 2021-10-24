public class Adress {

    private String street, city, houseNumber;

    public Adress(String street, String city, String houseNumber) {
        this.street = street;
        this.city = city;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                '}';
    }

}


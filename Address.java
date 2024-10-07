public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // create an address
    public Address(String zip, String street, String city, String state) {
        this.zip = zip;
        this.street = street;
        this.city = city;
        this.state = state;

    }

    // display as a string
    public String toString() {
        return ("Zip code: " + zip + ", Street Address: " + street + ", City/Town: " + city + ", State: " + state);
    }
}

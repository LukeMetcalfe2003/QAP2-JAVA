public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // create a person
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // display as a string
    public String toString() {
        return ("First Name: " + firstName + " Last Name: " + lastName + " Home: " + home);
    }
}

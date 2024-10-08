public class CreditCardDemo {
    public static void main(String[] args) {
        final Money limit = new Money(1000);
        final Money firstAmount = new Money(200);
        final Money secondAmount = new Money(10.02);
        final Money thirdAmount = new Money(25);
        final Money fourthAmount = new Money(990);

        // Making new owner
        Person owner = new Person("Metcalfe", "Luke", new Address("A1W 4T3", "90 Sweetenwater Crescent", "CBS", "NL"));
        CreditCard visa = new CreditCard(owner, limit);

        // Display the owner
        System.out.println(visa.getPersonals());

        // Display initial balance
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();

        // First attempt
        System.out.println("Attempting to charge " + firstAmount);
        visa.charge(firstAmount);
        System.out.println("Balance: " + visa.getBalance());

        // Second attempt
        System.out.println("Attempting to charge " + secondAmount);
        visa.charge(secondAmount);
        System.out.println("Balance: " + visa.getBalance());

        // Third attempt
        System.out.println("Attempting to charge: " + thirdAmount);
        visa.payment(fourthAmount);
        System.out.println("Balance: " + visa.getBalance());

        // Fourth attempt
        System.out.println("Attempting to charge " + fourthAmount);
        visa.charge(fourthAmount);
        System.out.println("Balance: " + visa.getBalance());

    }
}

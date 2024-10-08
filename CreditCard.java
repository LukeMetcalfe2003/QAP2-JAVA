public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // create a new credit card with a balance and a limit
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    // Getters and setters
    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public String getPersonals() {
        return owner.toString();
    }

    // Charge the account
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Declined... Charge exceeds the credit amount.");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Thanks for your payment of " + amount);
    }
}

public class Money {
    private long dollars;
    private long cents;

    // Constructor
    public Money(double amount) {
        this.dollars = (long) amount;
    }

    // copy constructor
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Methods
    public Money add(Money otherAmount) {
        return new Money(this.dollars + otherAmount.dollars + (this.cents + otherAmount.cents) / 100);
    }

    public Money subtract(Money otherAmount) {
        return new Money(this.dollars - otherAmount.dollars + (this.cents - otherAmount.cents) / 100);
    }

    public int compareTo(Money otherObject) {
        if (this.dollars > otherObject.dollars) {
            return 1;
        } else if (this.dollars < otherObject.dollars) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean equals(Money otherObject) {
        if (this.dollars == otherObject.dollars && this.cents == otherObject.cents) {
            System.out.println("Equal");
            return true;
        } else {
            System.out.println("Not Equal");
            return false;
        }
    }

    // display as a formatted string
    public String toString() {
        return String.format("$%d.%02d", this.dollars, this.cents);
    }
}

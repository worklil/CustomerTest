
public class Money implements Comparable<Money> {

    private Integer pounds;
    private Integer pence;

    public Money(Integer pounds, Integer pence) {
        this.pounds = pounds;
        this.pence = pence;
    }

    public boolean equals(Object otherObject) {
        return (this.pounds.equals(((Money) otherObject).pounds))
                && (this.pence.equals(((Money) otherObject).pence));
    }

    public int compareTo(Money amount) {
        Integer result = this.pounds.compareTo(amount.pounds);
        if (result == 0) // pounds are equal so compare pence
        {
            result = this.pence.compareTo(amount.pence);
        }
        return result;
    }

    public String toString() {
        String moneyDetails = new String();
        moneyDetails += this.pounds + ".";
        if (this.pence < 10) {
            moneyDetails += "0";
        }
        moneyDetails += this.pence;
        return moneyDetails;
    }

}

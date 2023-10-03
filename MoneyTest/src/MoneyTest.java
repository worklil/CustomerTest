
public class MoneyTest {

    public static void main(String[] args) {
        Money amount1,amount2;
        Integer pounds,pence;
        do {
            pounds = Input.getInteger("pounds: ");
            pence = Input.getInteger("pence: ");
            amount1 = new Money(pounds,pence);
            pounds = Input.getInteger("pounds: ");
            pence = Input.getInteger("pence: ");
            amount2 = new Money(pounds,pence);
            System.out.println("amount1: " + amount1);
            System.out.println("amount2: " + amount2);
            System.out.println("amount1 equals amount2: " + amount1.equals(amount2));
            if (amount1.compareTo(amount2) < 0) {
                System.out.println("amount1 is less than amount2");
            } else if (amount1.compareTo(amount2) > 0) {
                System.out.println("amount1 is greater than amount2");
            } else {
                System.out.println("amounts are equal");
            }
        } while (Repeat.repeat());
    }
}

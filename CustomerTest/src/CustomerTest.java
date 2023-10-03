public class CustomerTest {

    public static void main(String[] args) {
        String name;
        String street;
        String town;
        name = Input.getString("name: ");
        street = Input.getString("street: ");
        town = Input.getString("town: ");
        Customer customer = new Customer(name, street, town);
        System.out.println(customer);
    }
}

public class Customer {
    private String name;
    private Address address;
    
    public Customer(String name, String street, String town){
        this.name=name;
        this.address=new Address(street,town);
    }
    
    public String toString(){
        return "name: "+this.name+" address: "+this.address;
    }
}

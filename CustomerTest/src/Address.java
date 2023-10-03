public class Address {
    private String street;
    private String town;
    
    public Address(String street,String town){
        this.street=street;
        this.town=town;
    }
    
    public String toString(){
        return this.street+","+this.town;
    }
}

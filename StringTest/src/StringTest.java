public class StringTest{
    public static void main (String[] args){
        String string=Input.getString("string: ");
        for (Integer position=0;position<string.length();position++)
            System.out.println(string.charAt(position));
   }
}

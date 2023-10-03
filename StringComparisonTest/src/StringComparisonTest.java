public class StringComparisonTest{
    public static void main (String[] args){
        do{
            String firstString=Input.getString("input first string: ");
            String secondString=Input.getString("input second string: ");
            System.out.println("firstString.equals(secondString): "+firstString.equals(secondString));
            System.out.println("firstString.equalsIgnoreCase(secondString): "+firstString.equalsIgnoreCase(secondString));
            if (firstString.compareTo(secondString)==0)
                System.out.println("using compareTo: strings are equal");
            else
                if (firstString.compareTo(secondString)<0)
                    System.out.println("using compareTo: firstString is less than secondString");
                else
                    System.out.println("using compareTo: firstString is greater than secondString");
            if (firstString.compareToIgnoreCase(secondString)==0)
                System.out.println("using compareToIgnoreCase: strings are equal");
            else
                if (firstString.compareToIgnoreCase(secondString)<0)
                    System.out.println("using compareToIgnoreCase: firstString is less than secondString");
                else
                    System.out.println("using compareToIgnoreCase: firstString is greater than secondString");
        }while (Repeat.repeat());
    }
}
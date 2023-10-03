import java.util.*;
public class ParameterPassingTest{
    public static void main(String[] args){
        Integer value=10;
        System.out.println("main original value: "+value);
        updateValue1(value);
        System.out.println("main after updateValue1: "+value);
        value=updateValue2(value);
        System.out.println("main after updateValue2: "+value);
	
        Date date=new Date();
        System.out.println("main original date: "+date);
        date.setMonth(5);//sets month to june
        System.out.println("main after setMonth: "+date);
        updateDate1(date);//tries to set month to august
        System.out.println("main after updateDate1: "+date);
        updateDate2(date);//tries to set month to october
        System.out.println("main after updateDate2: "+date);
        date=updateDate3(date);//tries to set month to december
        System.out.println("main after updateDate3: "+date);
		
    }
	
    private static void updateValue1(Integer value){
        value++;
        System.out.println("updateValue1 after increment: "+value);
    }
	
    private static Integer updateValue2(Integer value){
        value++;
        return value;
    }
	
    private static void updateDate1(Date date){
        date.setMonth(7);// sets to august
    }

    private static void updateDate2(Date date){
        date=new Date();
        System.out.println("updateDate2 after new date: "+date);
        date.setMonth(9);//sets to october
        System.out.println("updateDate2 after setMonth: "+date);
    }
	
    private static Date updateDate3(Date date){
        date=new Date();
        date.setMonth(11);//sets to december
        return date;
    }

}
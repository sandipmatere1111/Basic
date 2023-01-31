import java.util.*;
public class DateAfter {
    public static void main(String[] args){
        int noOfDays = 14;
        Calendar cal = Calendar.getInstance();
        Date cd = cal.getTime();

        cal.add(Calendar.DAY_OF_YEAR, noOfDays);
        Date date = cal.getTime();

        System.out.println("\nCurrent Date: " + cd+"\n");
        System.out.println("Day after two weeks: " + date+"\n");
    }
}

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DefaultCal {
    public static void main (String [] args){

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.YEAR));
    }
}

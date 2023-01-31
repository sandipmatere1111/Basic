import java.util.Calendar;
import java.util.TimeZone;

public class NewYorkTime {
    public static void main (String[] args){
        Calendar newYorkCal = Calendar.getInstance();
        newYorkCal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println();
        System.out.println("Time in New_York = "+newYorkCal.get(Calendar.HOUR_OF_DAY));
        System.out.println(newYorkCal.get(Calendar.MINUTE));
        System.out.println(newYorkCal.get(Calendar.SECOND));
    }
}

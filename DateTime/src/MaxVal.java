import java.util.Calendar;
public class MaxVal {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        int maxYear = cal.getActualMaximum(Calendar.YEAR);
        System.out.println(maxYear);

        int maxMonth = cal.getActualMaximum(Calendar.MONTH);
        System.out.println(maxMonth);

        int maxDate = cal.getActualMaximum(Calendar.DATE);
        System.out.println(maxDate);

        int maxHours = cal.getActualMaximum(Calendar.HOUR);
        System.out.println(maxHours);

    }
}

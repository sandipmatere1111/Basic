 import java.util.*;
    public class DateObj {
        public  static void main(String [] args){
            //take year month date
            System.out.println("Enter your birth year");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();

            System.out.println("Enter a birth month");
            Scanner sc1 = new Scanner(System.in);
            int month = sc1.nextInt();

            System.out.println("Enter a birth date");
            Scanner sc2 = new Scanner(System.in);
            int date = sc2.nextInt();

            Calendar cal = Calendar.getInstance();
            cal.clear();
            System.out.println();
            cal.set(Calendar.YEAR , year);
            cal.set(Calendar.MONTH,month);
            cal.set(Calendar.DATE,date);

            System.out.println("This is your birth date = "+ cal.getTime());

        }
    }
}

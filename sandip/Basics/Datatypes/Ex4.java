//converts minutes in number of years and days
import java.util.Scanner;
public class Ex4{
    public static void main (String[] args){
        System.out.println("Enter time in minutes");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int years = min /(60*24*365);
        int minRem =  min % (years*60*24*365);
        int days = minRem/(60*24);
        System.out.println(years +" years and "+days+" days");

    }
}
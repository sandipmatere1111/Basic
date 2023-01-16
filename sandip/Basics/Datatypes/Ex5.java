//seconds to format

import java.util.Scanner;
public class Ex5{
    public static void main (String[] args){
        System.out.println("Enter time in minutes");
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int hours = sec /(60*60);
    
        sec -= hours*60*60;
        
        int min = sec/60;
        sec -= min*60;
        String hourr = String.format("%02d",hours);
        String minn = String.format("%02d",min);
        String secc = String.format("%02d",sec);
        System.out.printf("%s:%s:%s",hourr,minn,secc);

        //System.out.println(hours +":"+min":"+sec);
        //System.out.printf("%02d %n", hours);
        //System.out.printf("%02d %n", min);
        //System.out.printf("%02d %n", sec);

    }
}
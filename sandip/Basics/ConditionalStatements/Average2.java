import java.util.Scanner;
public class Average2{
    public static void main (String[] args){
    System.out.println("Enter 5 numbers");
        double avg=0.0 , sum=0.0 ,num=0.0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++){
            num = sc.nextInt();
            sum+=num;
        }
        avg = sum/5;
        System.out.println("sum of num is = "+sum+"average of num is = "+avg);
    }
}
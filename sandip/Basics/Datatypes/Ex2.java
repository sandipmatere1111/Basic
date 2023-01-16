//reads number in inch and convert to meter
import java.util.Scanner;
public class Ex2{
    public static void main (String [] args){
        System.out.println("Enter distance in inch ");
        Scanner sc = new Scanner(System.in);
        float inch = sc.nextFloat();
        float meter = inch*0.0254F;
        System.out.println("your distance in meter is ="+meter); 
    }
}
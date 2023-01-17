import java.util.Scanner;
import java.lang.Math;
// read class created to take int as input
/*class Read {
    int readd (){
       Scanner sc = new Scanner(System.in);
       int temp = sc.nextInt(); 
       return temp;
    }
}    
*/  

public class Quadratic {
    public static void main (String[] args){
        Read d = new Read();
        
        System.out.println("Enter coefficent of x^2");
        int a = d.read();

        System.out.println("Enter coefficent of x");
        int b = d.read();

        System.out.println("Enter constant");
        int c = d.read();    

        float result = b*b-4*a*c;
        double r1 = 0.0;
        double r2 = 0.0;
        if(result>=0){
            r1 = (-b + Math.pow(result,0.5))/2*a;
            r2 = (-b - Math.pow(result,0.5))/2*a;
        }
        else{
            System.out.println("imaginary roots");
        }         
        System.out.println(r1 + " and "+ r2);
    }
}
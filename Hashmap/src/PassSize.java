import java.util.Scanner;
import java.util.*;

public class PassSize {
    public static void main(String[] args){
        System.out.println("Enter no of elements");
        //HmAdd is class object is created as follows
        HmAdd hashM = new HmAdd();
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hashM.element(n));
        HashMap<Integer,String> newH = new HashMap<>();

        newH.putAll(hashM.element(n));
        System.out.println(newH);
    }
}

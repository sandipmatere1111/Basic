import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class AddElements {
    public static void main (String[] args){


        Scanner getInt = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int a = getInt.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements now");

        HashSet<String> Hs = new HashSet<String>();
        for(int i=0;i<a;i++) {
            String s = sc.nextLine();
            Hs.add(s);
        }

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements now");
        for(int i=0;i<a;i++) {
            String s = sc.nextLine();
            Hs.add(s);
        } */

        System.out.println(Hs);
        System.out.println("Verifying Size "+ Hs.size());
    }
}

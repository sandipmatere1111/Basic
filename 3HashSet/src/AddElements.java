import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class AddElements {
    public static void main (String[] args) {


        Scanner getInt = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int a = getInt.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements now");

        HashSet<String> hS = new HashSet<String>();
        for (int i = 0; i < a; i++) {
            String s = sc.nextLine();
            hS.add(s);
        }

        Iterator<String> p = hS.iterator();
        while (p.hasNext()) {
            System.out.println(p.next());
        }

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements now");
        for(int i=0;i<a;i++) {
            String s = sc.nextLine();
            Hs.add(s);
        } */

        System.out.println(hS);
        System.out.println("Verifying Size "+ hS.size());

        //cloning a hashset

        HashSet<String> New_Hs = new HashSet<>();
        New_Hs = (HashSet)hS.clone();
        System.out.println(New_Hs);
        System.out.println(New_Hs.isEmpty());

        //Hash to an array
        String[] arr = new String[hS.size()];
        hS.toArray(arr);
        System.out.println("1st element of array = "+ arr[1]);

        //remove all elements from HashSet
        hS.clear();
        System.out.println(hS);

    }
}

import java.util.*;
public class L1elementInL2 {
    public static void main (String[] args){
        LinkedList<String> s1= new LinkedList<String>();
        s1.add("Ram");
        s1.add("Laxman");
        s1.add("Bharat");
        s1.add("Shatrughna");
        s1.add("Shiv");

        LinkedList<String> s2= new LinkedList<String>();
        s2.add("Ram");
        s2.add("Sham");
        s2.add("Bharat");
        s2.add("Shiv");

        //replacing the element in a llinkedlist
        s1.set(4,"Hanuman");
        System.out.println(s1);

        LinkedList<String> s3= new LinkedList<String>();
        for (String e:s1){
        s3.add(s2.contains(e) ? "yes" : "No");
        }
        System.out.println(s3);


        //Converting a Llinked list in a arraylist by passing the object of LinkedList

        List<String> ls = new ArrayList<String>(s1);
        for(String element: ls){
            System.out.println(element);
        }

    }
}

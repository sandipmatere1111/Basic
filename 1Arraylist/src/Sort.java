import java.util.*;

public class Sort {
        public static void main (String[] args) {
            LinkedList<String> s1 = new LinkedList<String>();
            s1.add("Ram");
            s1.add("Laxman");
            s1.add("Bharat");
            s1.add("Shatrughna");
            s1.add("Shiv");

            Collections.sort(s1);
            System.out.println(s1);
        }

}

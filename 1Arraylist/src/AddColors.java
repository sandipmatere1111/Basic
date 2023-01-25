import java.util.*;

public class AddColors {
    public static void main (String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Violet");
        ls.add("Indigo");
        ls.add("Blue");
        ls.add("Green");
        ls.add("Yellow");
        ls.add("Orange");
        ls.add("Red");
        ls.add("Red");
        System.out.println(ls);

        ls.add(0, "Rainbow Colors -");   //adding element at 1st position
        //for each loop
        /* for(String element:ls){
            System.out.println(element);
        }

        //for loop
        for (int i = 0; i < ls.size();i++){
            System.out.println(ls.get(i));
        }

        */

        // retrieve element from array list
        String c1 = ls.get(1);
        System.out.println("color at index is " + c1);

        //remove element
        ls.remove(0);
        ls.remove(0);
        System.out.println(ls);

        //search element
            System.out.println("index of color is " + ls.indexOf("Blue")); //returns only one
        //compares each element then returns

        if (ls.contains("Red")){
            System.out.println("color found at index "+ ls.indexOf("Red"));
        }else{
            System.out.println("Not found");
        }

        //sorting array
        Collections.sort(ls);
        System.out.println("Sorted Array "+ls);

        //reversing String
        Collections.reverse(ls);
        System.out.println("Reversed String "+ls);

        //collection shuffle
        Collections.shuffle(ls);
        System.out.println("Shuffled array /n "+ls);




        //Copy array ls to ls2
        List<String> ls2 = new ArrayList<String>();
        ls2.add("B");
        ls2.add("G");
        ls2.add("I");
        ls2.add("O");
        ls2.add("R");
        ls2.add("R");
        ls2.add("Y");

        Collections.copy(ls,ls2);
        System.out.println(ls);
        System.out.println(ls2);

    }
}

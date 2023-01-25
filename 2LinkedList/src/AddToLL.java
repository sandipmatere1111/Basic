import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class AddToLL {
    public static void main (String[] args){
        LinkedList<String> Ll = new LinkedList<String>();

        //adding elements in linked list
        Ll.add("Sandip");
        Ll.add("Manya");
        Ll.add("Abhya");
        Ll.add("Rahulya");
        Ll.add("Ishya");
        System.out.println(Ll);

        LinkedList<String> Ll2 = new LinkedList<String>();
        Ll2.add("Dhiru");
        Ll2.add("Jitu");
        Ll2.add("Roshan");
        Ll2.add("Adarsh");



        //iterate through
        for(String element : Ll){
            System.out.println(element);
        }

        //iterate from nth position
        Iterator p = Ll.listIterator(1);
        System.out.println("My Friends ");

        while(p.hasNext()){
            System.out.println(p.next());
        }

        //iterate in reverse order
        Iterator p1 = Ll.descendingIterator();
        while(p.hasNext()){
            System.out.println("Reverse"+p1.next());
        }

        //add first, add last
        Ll.addFirst("Samadhan");
        Ll.addLast("Aftab");

        Ll.removeFirst();
        Ll.removeLast();
        System.out.println(Ll);

        //Swapping two elements
        Collections.swap(Ll,1,2);
        System.out.println(Ll);

        //shuffle a Linked List
        Collections.shuffle(Ll);
        System.out.println(Ll);


        //pop - remove and return
        System.out.println("removed elements = "+Ll.pop());
        //peek - doesn't remove but returns
        System.out.println(Ll.peekFirst());
        System.out.println(Ll.peekLast());
        System.out.println(Ll);

        //JOin two Linked Lists
        LinkedList<String> Ll3 = new LinkedList<String>();
        Ll3.addAll(Ll);
        Ll3.addAll(Ll2);

        System.out.println(Ll3);

        Ll.clear();
        System.out.println(Ll);
        System.out.println(Ll.isEmpty());
    }
}

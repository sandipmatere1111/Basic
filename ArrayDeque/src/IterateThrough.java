import java.util.ArrayDeque;
import java.util.Iterator;

public class IterateThrough {
    public static void main(String[] args){
        AddElements Ad1 = new AddElements();

        ArrayDeque<Integer> newAd = new ArrayDeque<Integer>(Ad1.addEle());

        Iterator <Integer> p = newAd.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }

        System.out.println("Array in reverse Order");
        // in reverse order
        Iterator<Integer> p1 = newAd.descendingIterator();
        while(p1.hasNext()){
            System.out.println(p1.next());
        }
    }
}

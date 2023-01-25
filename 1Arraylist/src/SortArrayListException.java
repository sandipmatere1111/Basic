import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListException {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> aL2 = new ArrayList<Integer>();
            aL2.add(2);
            aL2.add(4);
            aL2.add(6);
            aL2.add(8);
            aL2.add(10);

            Collections.sort(aL2);
            System.out.println(aL2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("EXception Thrown" +e);
        }catch(IllegalArgumentException e){
            System.out.println("Exception Thrown " +e);
        }
    }
}

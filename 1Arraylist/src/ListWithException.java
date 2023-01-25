import java.util.*;
import java.util.ArrayList;
public class ListWithException {
    public static void main(String[] args){
        try{
            ArrayList<String> aL = new ArrayList<String>();
            aL.add("dadu");
            aL.add("Rudra");
            aL.add("Shree");
            aL.add("Shhhh");
            aL.add("Set");

            List<String> arrlist2 = aL.subList(2,4);
            System.out.println(aL);

        }catch(IndexOutOfBoundsException e){
            System.out.println("Exception Thrown" +e);

        }catch (IllegalArgumentException e){
            System.out.println("Exception Thrown" +e);
        }
    }
}

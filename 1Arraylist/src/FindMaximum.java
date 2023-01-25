import java.util.*;

class Find{
    public Integer Max(List<Integer> aL){
        if(aL==null||aL.size()==0){
            return Integer.MAX_VALUE;
        }
        List<Integer> sorted = new ArrayList<Integer>(aL);
        Collections.sort(sorted);

        return sorted.get(sorted.size()-1);

    }
}

public class FindMaximum {
    public static void main(String[] args){
        List<Integer> aL = new ArrayList<Integer>();
        aL.add(20);
        aL.add(31);
        aL.add(45);
        aL.add(100);
        aL.add(60);

        Find m = new Find();
        System.out.println("Max value is = "+ m.Max(aL));
    }
}

import java.util.HashMap;

public class HashSize {
    public static void main (String[] args){
        Hm hash = new Hm();
        HashMap<Integer,String> newHash = new HashMap<>(hash.showEle());

        System.out.println(hash.showEle().size());
        System.out.println(newHash.size());

    }
}
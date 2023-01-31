import java.util.*;
class Hm {
    Map<Integer,String> showEle() {
        HashMap<Integer, String> hash_m = new HashMap<>();
        //hash_m.put(key,value);
        hash_m.put(1, "China");
        hash_m.put(2, "India");
        hash_m.put(3, "Usa");
        hash_m.put(4, "Indonesia");
        hash_m.put(5, "Pakistan");

        //if try to assign same key to a new value , old value will be vanished and new will be added
        hash_m.put(1, "India");
        hash_m.put(2, "China");

        //can add same values to differ keys
        hash_m.put(6, "Pakistan");

        return hash_m;
    }
}

import java.util.ArrayDeque;

public class AddElements {
    ArrayDeque<Integer> addEle() {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.push(1);
        ad.push(2);
        ad.push(3);
        ad.push(4);
        ad.push(2);

        return ad;
    }
}



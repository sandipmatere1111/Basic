import java.util.ArrayDeque;

public class Remove {
    public static void main (String [] args){
        AddElements ad2 = new AddElements();
        ArrayDeque<Integer> newAd = ad2.addEle();

        //removes only
        newAd.remove();
        System.out.println(newAd);

        //Poll removes and returns also
        Integer element = newAd.poll();
        System.out.println("Removed element = "+ element);
        System.out.println(newAd);



    }
}

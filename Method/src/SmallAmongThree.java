
public class SmallAmongThree {
    public static void main (String[] args){
        int d = Smallest(4,2,100);
        System.out.println(d);
    }
    public static int Smallest(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }
}

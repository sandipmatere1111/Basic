class Add{
    public int sum(int a,int b,int c){
        return a+b+c ;
    }
}
public class AddThreeNum {
    public static void main (String[] args){
        Add abc = new Add();
        int d = abc.sum(3,4,5);
        System.out.println(d);
    }
}

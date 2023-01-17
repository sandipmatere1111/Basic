//1st row 1, 2nd row 2 3 ,  upto n
public class pattern{
    public static void main (String[] args){
      System.out.println("Enter a number");
      Read num = new Read();
      int n = num.read();
      for(int i =0;i<n;i++){
        for(int j =0;j<=i;j++){
            System.out.print(" "+ (i+j+1));
        }
        System.out.println("");
      }
    }
}
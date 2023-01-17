//taking half value of diamond
public class Diamond{
    public static void main (String[] args){
        Read num = new Read();
        int r= num.read();

        for(int i=0;i<=r;i++){
            for(int j=0;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=r-1;i>0;i--){
            for(int j=0;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
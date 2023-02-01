import java.util.Scanner;
public class PentagonNo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            System.out.print(pentagonNo(i)+" ");
            if(i%10==0){
                System.out.println();
            }

        }
    }
    public static int pentagonNo(int i){
        return (i * (3 * i - 1))/2;
    }
}

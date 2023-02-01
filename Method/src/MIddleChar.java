import java.util.Scanner;
public class MIddleChar {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();

        System.out.println(middle(str));
    }

    public static String middle(String str){
        int position=0;
        int len = str.length();
        int l=0;
        if(len%2==0){
            position = (len /2)-1 ;
            l=2;
        }
        if(len%2!=0){
            position = len/2;
            l=1;
        }
        return str.substring( position , position+l);
    }
}

import java.util.*;

public class CharA{
    public static void main (String[] args){
        Input strr = new Input();
        String s = strr.Str();
        System.out.println(s);
        int c = s.charAt(2);
        //Char at index
        System.out.println((char)c);

        //Unicode of char at index codePointAt,codePointBefore
        System.out.println(c);
        c=s.codePointAt(2);
        System.out.println(c);



       
    }
}

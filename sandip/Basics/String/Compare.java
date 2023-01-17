public class Compare{
    public static void main (String[] args){
        Input sc = new Input();
        String str1 = sc.Str();
        String str2 = sc.Str();
        //compares every char at same index of both Strings
        System.out.println(str1.compareTo(str2));

        //concating str2 at end of str1
        String strCon =str1.concat(str2);
        System.out.println(strCon);

        //contais particular str in another or not
         boolean result = str1.contains(str2);
         System.out.println(result);

         //compare Charater sequence with sring
         CharSequence cs = "sandip.matere";
         result = str1.contentEquals(cs);
         System.out.println(result);

         //Comparing with string buffer
         StringBuffer strbuf =new StringBuffer(str1);
         System.out.println( str1.contentEquals(strbuf));
         System.out.println( str2.contentEquals(strbuf));

         

    }
} 
import java.lang.String;
import java.util.Scanner;
public class CountsVowels {
    public static  void main ( String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toLowerCase();
        System.out.println("String contains "+ vowel(str)+" vowels");

    }
    public static int vowel(String str) {
        int vowels = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u') {
                vowels++;
            } else if (str.charAt(j) == 'A' || str.charAt(j) == 'E' || str.charAt(j) == 'I' || str.charAt(j) == 'O' || str.charAt(j) == 'U') {
                vowels++;
            }
        }
        return vowels;
    }
}


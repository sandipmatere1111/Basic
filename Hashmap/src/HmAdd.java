import java.util.HashMap;
import java.util.Scanner;

class HmAdd {
    HashMap<Integer, String> element(int n){
        HashMap<Integer,String> hm2 = new HashMap<>();
            for(int i=1;i<=n;i++) {
                System.out.println("Enter a key");
                Scanner sc1 = new Scanner(System.in);
                int kv = sc1.nextInt();
                if(n>0){
                    System.out.println("Enter a value for key " +kv);
                    Scanner sc2 = new Scanner(System.in);
                    String vk = sc2.nextLine();
                    hm2.put(kv,vk) ;
                }
            }
        return hm2;
    }
}

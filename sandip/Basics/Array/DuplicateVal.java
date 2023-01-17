//count of unique val
import java.util.Arrays;
public class DuplicateVal{
    public static void main (String[] args){
        int[] arr ={2,2,4,5,4,6,7,8,4};
        System.out.println(" Original arr" + Arrays.toString(arr));
        System.out.println(dupli(arr));
    }
    public static int dupli(int[] arr){
        int index=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[index-1]){
                arr[index++]=arr[i];
            }
        }
        return index;

    }
}
/*failed method
class Duplicate{
    int[] removeDupli(int arr[]){
        int[] arr2 = new int[arr.length];
        int removed=0;
        for(int i =0,k=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    continue;
                }else if(k<arr2.length){
                    removed++;
                    arr2[k++]=arr[i];
                }else{
                    break;
                }
                
            } 
        }
        int[] arr3= new int[removed];
        for(int i =0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(i<=removed){
                    arr3[i]=arr2[i];
                }else{
                    break;
                }
            } 
        }
        
        return arr3;
    } */
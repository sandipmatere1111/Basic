import java.util.Arrays;
class Calculate{
    public int Add(int arr[]){
        int sum=0;
        for(int element:arr){
            sum+=element;
        }
        return sum;
    }
}


public class Sort{
    public static void main (String[] args){
        int[] arr = new int[4];
        Read num = new Read();
        for (int i=0;i<arr.length;i++){
            arr [i]=num.read();
        }
        System.out.println(" Original arr" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(" Sorted arr" + Arrays.toString(arr));

        //Sum

        Calculate calc = new Calculate();
        System.out.println("sum of elements of array is = "+calc.Add(arr));
        
        //sorting

        /*for(int i =0;i<arr.length;i++){
            arr[i]= num.read();
        }
        int temp=0;
        int s = arr.length;
        for(int i=0;i<s;i++){
            for (int j=i+1;j<s;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }                
            }                 
        } 
        for(int element:arr){
            System.out.print(" " +element);
        } */
    }
}    
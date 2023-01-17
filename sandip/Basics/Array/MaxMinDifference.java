//max,min,max min differnce , sorted array
/*class Differ{
    int temp=0;
    int diff(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){      
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }      
        }
        int min=arr[0];
        int max = arr[arr.length-1];
        int dif = max-min;
        return dif;
    }
}*/

public class MaxMinDifference{
    public static void main (String[] args){
        int[] arr= {2,3,37,190,200};
        Sort s = new Sort();
        System.out.println(d.diff(arr));

    }
}
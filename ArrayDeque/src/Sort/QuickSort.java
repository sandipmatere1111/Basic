package Sort;

import java.util.Arrays;

public class QuickSort {
    private int temp_arr [];
    private int len;

    public void sort(int[] arr){
        if(arr ==null || arr.length==0){
            return;
        }
        this.temp_arr =arr;
        len=arr.length;
        quickSort(0,len-1);
    }
    public void quickSort(int high_i , int low_i) {
        int i = low_i;
        int j = high_i;

        int pivot = temp_arr[low_i + (high_i-low_i)/ 2];
        while (i <= j) {
            if (temp_arr[i] < pivot) {
                i++;
            }
            while (temp_arr[j] > pivot) {
                j--;
            }
            if (temp_arr[i] <= temp_arr[j]) {
                exchangeNo(i, j);
                i++;
                j--;
            }
        }
            if (low_i < j)
                quickSort(low_i, j);
            if (i < high_i)
                quickSort(i, high_i);
    }

        private void exchangeNo (int i, int j){
            int temp = temp_arr[i];
            temp_arr[i] = temp_arr[j];
            temp_arr[j] = temp;
        }


    public static void main (String args[]){
        QuickSort os = new QuickSort();
        int[] arr = {5,7,3,10,3};
        System.out.println(Arrays.toString(arr));
        os.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

public class Lookfor{
    public static int findIndex(int[] arr ,int a){
        if(arr ==null)return -1;
        int len = arr.length;
        int i=0;
        while(i<len){
            if(arr[i]==a){
                System.out.print(arr[i]+" is at index " );
                return i;
            }
            else{
                 i=i+1;
                }
        }
        return -1;
    }
    public static void main (String[] args){
        int[] arr={2,3,5,6,7};
        Read search = new Read();
        int i = search.read();
        System.out.println(findIndex(arr,i));
    }
}
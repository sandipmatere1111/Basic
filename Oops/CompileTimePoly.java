//compile time

class Addition{
    int add(int a , int b){
        return a+b;
    }

    int add(int a , int b , int c){
        return a+b+c;
    }

    int add(int...arr){
        int sum =0;
        for(int element :arr){
            sum += element;
        }
        return sum;
    }
}
class CompileTimePoly {
    public static void main (String[] args){
        Add sum = new Add(3,4);

    }
}
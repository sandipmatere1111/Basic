public class Average{
    public static void main (String [] args ){
        Read num = new Read();
        int num1 = num.read();
        int num2 = num.read();
        int num3 = num.read();
        int num4 = num.read();
        int num5 = num.read();

        float sum = num1+num2+num3+num4+num5;
        float avg = sum/5;

        System.out.println("Sum of numbers is = "+sum+" and their average is = "+avg);
    }
}
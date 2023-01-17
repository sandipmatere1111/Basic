public class Days{
    public static void main(String[] args){
        Read days = new Read();
        System.out.println("Enter num between 1 to 7 to get a day");
        int day = days.read();

        switch (day) { 
            case 1 : System.out.println("Monday");
                    break;
            case 2 : System.out.println("Tuesday");
                    break;
            case 3 : System.out.println("Wensday");
                    break;
            case 4 : System.out.println("Thursday");
                    break;
            case 5 : System.out.println("Friday");
                    break;
            case 6 : System.out.println("Saturday");
                    break;
            case 7 : System.out.println("Sunday");
                    break;
            default : System.out.println("Invalid Input");
        }
    
    }
}
interface RBI{
    float ROI();
}

class Sbi implements RBI {
    public float ROI(){
       return (9.7f);
    }
}

class MGB implements RBI{
    public float ROI(){
        return (9.5f);
    }
}
public class Interface1{
    public static void main(String[] args){
        Sbi bank1 = new Sbi();
        System.out.println(bank1.ROI());
    }
}

class Car{
    private String carName;
    private int speed;

    Car(String carName , int speed){
        this.carName=carName;
        this.speed=speed;
    }
    
    public String getCarName(){
        return this.carName;
    }

    public int getSpeed(){
        return this.speed;
    }
}
public class MyCar{
    public static void main(String[] args){
        Car thar = new Car("thar",200);
        System.out.println(thar.getSpeed());
    }
}
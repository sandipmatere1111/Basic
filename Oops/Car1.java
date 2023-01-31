class Thar extends MyCar{
    
    Thar(String carName, int speed){
    super();
    }
    
    public String getCarName(){
        return carName;
    }
    public int getSpeed(){
        return speed;
    }
}

class Car1{
    public static void main (String[] args){
        Thar t1 = new Thar("AxOpt4",200);
        t1.getSpeed();
    }
}
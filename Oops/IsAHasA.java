class Cycle {
    private String colour;
    private int price;

    public void getInfo(){
        System.out.println("Cycle with a colour "+colour+" have a price of "+price);
    }
    
    public void setColour(String colour){
        this.colour=colour;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
class MyCycle{
    public static void main (String[] args){
        Cycle c1 = new Cycle();
        c1.setColour("black");
        c1.setPrice(1000);

        c1.getInfo();
    }
}

class Mobile {
 private String manufaturCom;
    private String operSys;
    private String model;
    private int cost;

    Mobile(String man, String o,String m,int c){
        this.manufaturCom = man;
        this.operSys=o;
        this.model=m;
        this.cost=c;
    }

    public String getModel(){
        return this.model;
    }
    public String getOperSys(){
        return this.operSys;
    }
    public String getManufacturCom(){
        return this.manufaturCom;
    }
    public int getCost(){
        return this.cost;
    }
}

class Iphon extends Mobile{
    Iphon(String man, String o,String m,int c){
        super(man,o,m,c);
    } 

    public String getModel(){
        return model ;
    }
}
public class Iphone{
    public static void main(String[] args){
        Iphon iphone = new Iphon("man","O","M",2);
        iphone.getModel(iphone);
    }
}
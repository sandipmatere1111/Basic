abstract class Sportsman{
    public abstract void meditate();
    public void exercise(){
        System.out.println("I run for a hour");
    }
}

class Cricketer extends Sportsman{
    public void meditate(){
        System.out.println("I meditate for an hour");
    }
    public void exercise(){
        System.out.println("I exercise for 2 hours");
    }
}

class abstract1 {
    public static void main (String [] args){
        Cricketer Virat = new Cricketer();
        Virat.meditate();
        Virat.exercise();
    }
}
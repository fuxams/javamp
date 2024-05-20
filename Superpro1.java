public class Superpro1 {
    Superpro1(int i){
        System.out.println("Base class constructer values:"+i);

    }
}
class Derived extends Superpro1{
        Derived(){
            super(100);
            System.out.println("derived class constructor");
        }
}
class Test{
    public static void main(String[] args){
        Derived obj = new Derived();
    }
}

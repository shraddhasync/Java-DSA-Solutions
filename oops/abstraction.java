package oops;

public class abstraction {
    public static void main(String[] args) {
        horse h1=new horse();
        h1.walk();

        chicken c1=new chicken();
        c1.walk();
        
    }
    
}
abstract class animal{
    abstract void walk();

    
}
class horse extends animal{
    public void walk(){
        System.out.println("horse walks");
    }
}
class chicken extends animal{
    public void walk(){
        System.out.println("chicken walks");
    }
}

package oops;

public class interfaces {
    public static void main(String[] args) {
        horse h1=new horse();
        h1.walk();
    }
    
}
interface animal{
      void walk();
}
interface herbivore{

}
class horse implements animal,herbivore{
    public void walk(){
        System.out.println("horse walk on 4 legs");
    }

}

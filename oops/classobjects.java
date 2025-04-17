package oops;


public class classobjects {
    public static void main(String args[]){
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";

        pen pen2=new pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printcolor();
        pen2.printcolor();
        pen1.printtype();
        pen2.printtype();
 
        student s1=new student();
        s1.name="sarangya";
        s1.age=6;
        s1.printinfo();



    }
}
class pen{
    String color;
    String type;

    public static void write(){
        System.out.println("write something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
    }
}
class student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
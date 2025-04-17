package oops;

class concylinder{

    private int radius;
    private int height;
    
    public concylinder(int r,int h){
        System.out.println("area of cylinder: "+2*r*h);
        System.out.println("volume of cylinder :"+r*r*h);

    }

}
class cylinder{

    private int radius;
    private int height;

    public void setrad(int r){
        radius=r;
    }
    public void setheight(int h){
        height=h;
    }
    public int getrad(){
        return radius;
    }
    public int getheight(){
        return height;
    }
    public double area(){
        return 2*3.14*radius*height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }

}
class getset{
    private String name;
    private int age;
 
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
    public int getage(){
        return age;
    }
    public void setage(int i){
        age=i;
    }
 }

public class setttergetter {
    public static void main(String[] args) {

        //class getset
        getset s=new getset();
        
        s.setname("ram");
        System.out.println(s.getname());

        s.setage(12);
        System.out.println(s.getage());



        //class cylinder
        cylinder cy=new cylinder();

        cy.setrad(23);
        cy.setheight(24);
        System.out.println(cy.getrad());
        System.out.println(cy.getheight());
        System.out.println(cy.area());
        System.out.println(cy.volume());

        //class concylinder
        concylinder concy=new concylinder(2,6);





        


       


    }
}

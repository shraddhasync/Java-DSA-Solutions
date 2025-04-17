package oops;

//constructors can be overload just like mthod overloading\

class rango{
    private int height;
    private int breath;

   
    public rango(){
        System.out.println("hello gys");
    }
    public rango(int y){
        System.out.println(y);
    }
    public rango(int y,int z){
        System.out.println(y*z);
    }


}

class myemployee{

    private String name;
    private int age;
    private int salary;

    public myemployee(){
        name="harsh";
        age=13;
    }

    public myemployee(String n){
        name=n;
    }

    public myemployee(String n,int i){
        name=n;
        age=i;
    }
    public myemployee(int sal){
        salary=sal;
    }










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
    public void setsal(int sal){
        salary=sal;
    }
    public int getsal(){
        return salary;
    }


}

public class constructor {
    public static void main(String[] args) {
        
        myemployee em=new myemployee(230000);

        System.out.println(em.getname());
        System.out.println(em.getage());
        System.out.println(em.getsal());

        
        //class rango
        rango rec=new rango(2);

       


    }
    
}

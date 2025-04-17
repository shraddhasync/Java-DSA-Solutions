package oops;

class Employe{
    String name;
    int age;
    int salary;

    public void details(){
        System.out.println("name is :"+name);
        System.out.println("age is :"+age);

    }

    public int getsalary(){
        return salary;
    }
}

public class basic {
    public static void main(String[] args) {

        //object initialise
        Employe john=new Employe();
        Employe harsh=new Employe();

        //setting attributes
        john.name="john tripathi";
        john.age=12;

        harsh.name="harsh singh";
        harsh.age=56;
        harsh.salary=2300;

        //calling attributes
        System.out.println(john.name);
        System.out.println(john.age);

        //calling method
        john.details();
        harsh.details();
        int salary=harsh.getsalary();
        System.out.println(salary);


    }
    
}

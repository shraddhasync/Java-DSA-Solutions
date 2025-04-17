package oops;

class circle{
    int radius;

    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}

class tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("firing the enemy");
    }
}

class rectangle{
    int length;
    int width;

    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length*width);
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}

class cellphone{
    public void ringing(){
        System.out.println("ringing....");
    }
    public void vibrating(){
        System.out.println("vibrating....");
    }
}

class Employee{
    int salary;
    String name;

    public int getsalary(){
        return salary;

    }

    public String getname(){ 
        return name;

    }

    public void setname(String n){
         name=n;
    }
}

public class basicquestions {
    public static void main(String[] args) {

        //classs Employee
        Employee john=new Employee();
        john.setname("harsh");          
        john.salary=45;
        System.out.println(john.getname());
        System.out.println(john.getsalary());


        //class cellphone
        cellphone samsung=new cellphone();
        samsung.ringing();
        samsung.vibrating();


        //class square
        square sq=new square();
        sq.side=2;
        
        System.out.println("area of square: "+sq.area());
        System.out.println("perimeter of square:"+sq.perimeter());

        //class rectangle
        rectangle rec=new rectangle();
        rec.length=2;
        rec.width=4;
        System.out.println("area of recctangle: "+rec.area());
        System.out.println("perimeter iof recctangle: "+rec.perimeter());

        //class tommy
        tommy player1=new tommy();
        player1.hit();
        player1.run();
        player1.fire();

        //class circle
        circle cir=new circle();
        cir.radius=4;

        System.out.println("area of circle: "+cir.area());
        System.out.println("perimeter of circle: "+cir.perimeter());

         




    }
    
}
    
    


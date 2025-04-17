package oops;

public class copyconstructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="shraddha";
        s1.age=6;
        s1.marks[0]=100;
        s1.marks[1]=12;
        s1.marks[2]=67;

        Student s2=new Student(s1);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}
class Student{
    String name;
    int age;
    int marks[];

    Student(){

    }

    Student(Student s1){  
        marks =new int[3];     //copy constructor
        this.name=s1.name;
        this.age=s1.age;
        this.marks=s1.marks;

    }
}



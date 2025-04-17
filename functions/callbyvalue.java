//call by value-
//here if we have 'int a=5' in main function and we pass this argument in another function,so we passsing copy of this agrument,not the actual value
//so if we perform operation in function itself,it use the copied value or manipulated value in function,
//but if we call 'a' in main function ,the operations will be done on basis of actual value.

package functions;

public class callbyvalue {

    public static void callbyvalue(int a){
         a=10;
         //System.out.println(a);


    }
    public static void main(String[] args) {
        int a=5;
        callbyvalue(a);
        System.out.println(a);
    }
    
}

//userdefined-
//program we write by own,like sum factorial or product function program.

//inbuilt functions-
// that are already built in java to be used directly,like math.pow,max,sqrt,sc.nextInt

//function overloading-
//having multiple methods with same name but different parameters(change in no. of parameters or types of parameters) in a single class.
//(function overloading totally deoend on diffrenece in parameters,not on return type)

package functions;
import java.util.Scanner;

public class theory2{

    public static int sum(int a,int b){            
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum (3,5));
        System.out.println(sum(2.5f,6.7f));           
        
    }
}
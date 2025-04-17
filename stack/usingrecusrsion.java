import java.util.Stack;

import rearray.reversewithoutnewarray;

public class usingrecusrsion {
    public  static void displayrec(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int top=s.pop();
        System.out.println(top);
        displayrec(s);
        s.push(top);
        
    }
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        displayrec(s);
        System.out.println(s);
    }
    
}

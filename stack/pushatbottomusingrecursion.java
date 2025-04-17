import java.util.Stack;

public class pushatbottomusingrecursion {
    public static void pushatbottom(Stack<Integer> s){

        if(s.isEmpty()){
            s.push(5);
            return;
        }
        
        int top=s.pop();
        pushatbottom(s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();

    
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushatbottom(s);

        System.out.println(s);
    }
     
    
}

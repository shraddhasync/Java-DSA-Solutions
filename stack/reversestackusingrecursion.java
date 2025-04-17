import java.util.Stack;


public class reversestackusingrecursion {
    public static void pushatbottom(Stack<Integer> s,int top){

        if(s.isEmpty()){
            s.push(top);
            return;
        }
        
        int x=s.pop();
        pushatbottom(s, top);
        s.push(x);
    }
    public static void reverse(Stack<Integer> s){

        if(s.size()==1){
            return;
        }

        int top=s.pop();
        reverse(s);
        pushatbottom(s,top);

    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        

        reverse(s);

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}
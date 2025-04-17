import java.util.Stack;

class MinStack {

    Stack<Integer> s=new Stack<>();


    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {

        for(int a : s){
               
        }

        while(!(s.size() ==1)){

            int val2=s.pop();
            int val1=s.pop();

            if(val1 < val2){
                s.push(val1);

            }else{
                s.push(val2);
            }
        }
        return s.peek();
        
    }
}
public class leetcode_155 {
    public static void main(String[] args) {
        
        MinStack m1 = new MinStack();

        

        


        
    }

    
}

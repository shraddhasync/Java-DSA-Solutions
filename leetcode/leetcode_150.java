import java.util.Stack;

public class leetcode_150 {
    public static int evalRPN(String[] tokens) {

        
        Stack<Integer> val=new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            char ch=str.charAt(0);
            
            
            if(str.matches("-?\\d+")){
               val.push(Integer.parseInt(str));
            }
            else{

                int val2=val.pop();
                int val1=val.pop();

                if(ch == '*'){
                    int newval=val1 * val2;
                    val.push(newval);
                }
                else if(ch == '+'){
                    int newval=val1 + val2;
                    val.push(newval);
                }
                else if(ch == '-'){
                    int newval=val1 - val2;
                    val.push(newval);
                }
                else{
                    int newval=val1 / val2;
                    val.push(newval);
                }

            }
           
        }
        
        return val.pop();
        
    }
    public static void main(String[] args) {
        String[] tokens={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));

    }
    
}

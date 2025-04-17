package stackquestions;

import java.util.Stack;

public class balancedbracket {
    public static boolean ifbalanced(String str){

        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);

            if(curr == '{' || curr == '[' || curr == '('){
                s.push(curr);

            }
            if(s.peek() == '(' && curr == ')' || s.peek() == '[' && curr == ']' || s.peek() == '{' && curr == '}'){
                s.pop();
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="[)";
        System.out.println(ifbalanced(str));
    }
    
}

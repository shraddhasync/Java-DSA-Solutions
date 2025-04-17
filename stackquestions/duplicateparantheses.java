package stackquestions;

import java.util.Stack;

public class duplicateparantheses {
    public static boolean ifduplicate(String str){
     Stack<Character> s=new Stack<>();

     for(int i=0;i<str.length();i++){
        char currele=str.charAt(i);

        if(currele != ')'){
            s.push(currele);
        }else{
            int count=0;
            while(s.peek() != '('){
                s.pop();
                count++;
            }
            if(count < 1){
            return true;
           
        }
     }
    }
    return false;
     
}
    public static void main(String[] args) {
        String str="(((a+b)+(c+d)))";
        System.out.println(ifduplicate(str));
    }
    
}

package stackquestions;

import java.util.Stack;

public class reverse {
    public static String reverseit(String str){


        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        String ans="";
        while (!s.isEmpty()) {
            char top=s.pop();
            ans=ans.concat(String.valueOf(top));

        }
        return ans;

    }
    public static void main(String[] args) {
        

        String str="GeeksQuiz";
        System.out.println(reverseit(str));
    }
    
}

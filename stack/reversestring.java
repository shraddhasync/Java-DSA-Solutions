
import java.util.*;

public class reversestring {
    static class stack{
        public static String reversing(String str){
            Stack<Character> s=new Stack<>();

            int index=0;
            while(index<str.length()){
                s.push(str.charAt(index));
                index++;
            }
            StringBuilder result=new StringBuilder();
            while(!s.isEmpty()){
                char curr=s.pop();
                result.append(curr);
            }
            return String.valueOf(result);

        }
        public static void main(String[] args) {
            String str="apple";
            System.out.println(reversing(str));

        }
    }
    
}

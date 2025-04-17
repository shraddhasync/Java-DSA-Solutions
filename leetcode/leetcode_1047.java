import java.util.Stack;

import hashing.removeduplicate;

public class leetcode_1047 {
   public static String removeDuplicates(String s) {
     
    Stack<Character> st=new Stack<>();

    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);

        if(st.isEmpty()){
            st.push(ch);
            
        }
        else if(st.peek() == ch){
            st.pop();
        }else{
            st.push(ch);

        }
    }

    Stack<Character> st2=new Stack<>();
    while(!st.isEmpty()){
        st2.push(st.pop());
    }
    String ans="";
    while(!st2.isEmpty()){
        ans=ans.concat(String.valueOf(st2.pop()));
    }
    return ans;
        
        
    }
    
    public static void main(String[] args) {
        String s="abbaca";
       System.out.println( removeDuplicates(s));
    }
    
}

import java.util.Stack;

public class leetcode_2696 {
    public static int minLength(String s) {

        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          
        if(!st.isEmpty()){
            if(ch == 'B' && st.peek() == 'A'){
                st.pop();
            }
            else if(ch == 'D' && st.peek() == 'C'){
                st.pop();
            }
            else{
                st.push(ch);
              
            }
        }else{
            st.push(ch);
        }
           
         

        }
        return st.size();

        
    }
    public static void main(String[] args) {
        String s="ABFCACDB";
        System.out.println(minLength(s));
    }
    
}

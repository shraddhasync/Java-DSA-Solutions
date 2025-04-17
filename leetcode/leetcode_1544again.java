import java.util.Arrays;
import java.util.Stack;

public class leetcode_1544again {
    public static String makeGood(String s) {
        
        Stack<Character> st=new Stack<>();

        
        for(int i=0;i<s.length();i++){

            if(!(st.isEmpty()) &&  (Math.abs((int)(st.peek()) - (int)(s.charAt(i))) == 32 )){
                    st.pop();
            }else{
                    st.push(s.charAt(i));
            }
            
        }
        
        
        
        
        char[] z=new char[st.size()];
        for(int i=z.length-1;i>=0;i--){
            z[i]=st.pop();
        }
    


        
        return new String(z);
    }    
    public static void main(String[] args) {
        String s="leEeetcode";
        System.out.println(makeGood(s));
    }
    
}

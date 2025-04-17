import java.util.Stack;

public class leetcode_1021 {
    
    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        String a = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                a = a.concat(String.valueOf(ch));
                st.push(ch);
            } else {
                a = a.concat(String.valueOf(ch));
                st.pop();
            }

            if (st.isEmpty()) {
    
                if(a.length() != 2){
                    
                    a = a.substring(1, a.length() - 1);
                    if (a.equals("")) {
                    return ans;
                    } else {
                    ans = ans.concat(a);
                    a = "";
                    } 
            
                }else{
                    a="";
                }
            }
        }
        return ans;

    }
                
            
        
      
    

    public static void main(String[] args) {
        String s = "()()()()(())";
        System.out.println(removeOuterParentheses(s));
    }
    
}
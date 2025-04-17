import java.util.Stack;

public class leetcode_1021again {
    public static void removeOuterParentheses(String s) {

        Stack<Character> st=new Stack<>();
        String a="";

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }else{

                if(st.isEmpty()){
                    continue;
                }
                a=a.concat(String.valueOf(st.pop()));
                a=a.concat(String.valueOf(s.charAt(i)));
                
                while(!st.isEmpty()){
                    st.pop();
                }
            }
            System.out.println(a);
        }
        System.out.println("res :"+a);
        
    }
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        removeOuterParentheses(s);
    }
    

    
}

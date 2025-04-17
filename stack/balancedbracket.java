import java.util.Stack;

public class balancedbracket {
    public static void main(String[] args) {
        String s="{[(])}";

        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char z=s.charAt(i);

            if(z == '{' || z == '[' || z == '('){
                st.push(z);
            }else{
                if((z == '}' && st.peek() == '{') ||(z == ']' && st.peek() == '[') || (z == ')' && st.peek() == '(')){
                    st.pop();
                }
            }
        }
        if(st.size() == 0){
            System.out.println("balanced");
        }else{
            System.out.println("not balanced");
        }

    }
    
}

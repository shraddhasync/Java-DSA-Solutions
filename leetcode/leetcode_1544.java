import java.util.Stack;

public class leetcode_1544 {
    public static String makeGood(String s) {

        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int cha=s.charAt(i);

            if(st.isEmpty()){
                st.push(ch);
            }
            else if(Math.abs(cha-(int)st.peek())==32){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        Stack<Character> sts=new Stack<>();

        while(!st.isEmpty()){
            sts.push(st.pop());
        }
        
        
        String ans="";
        while(!sts.isEmpty()){
            ans=ans.concat(String.valueOf(sts.pop()));
        }

        if(ans.length()==0){
            return "";
        }
        else{
            return ans;
        }
       
    }
        
    
    public static void main(String[] args) {
        String s= "abBAcC";
        System.out.println(makeGood(s));

    }
    
}

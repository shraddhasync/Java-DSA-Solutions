package stackquestions;

import java.util.Stack;

public class posttopre {
    public static void toprefix(String post){
        
        Stack<String> s=new Stack<>();
      
        for(int i=0;i<post.length();i++){

            if(post.charAt(i)>=65 && post.charAt(i)<=90){
                s.push(String.valueOf(post.charAt(i)));
            }else{

                Stack<String> s1 = new Stack<>();

                s1.push(s.pop());
                s1.push(String.valueOf(post.charAt(i)));
                s1.push(s.pop());

                String a = "";

                while(!s1.empty()){
                    a = a.concat(s1.pop());
                }
                
                s.push(a);
            }
        }

        String ans = String.valueOf(s);

        System.out.println(ans);

    }
    public static void main(String[] args) {
        String post="AB+CD-*";

        toprefix(post);
    }
    
}

import java.util.Stack;

import stackquestions.posttopre;

public class leetcode_1598 {
    public static int minOperations(String[] logs) {

        Stack<String> s=new Stack<>();

        

        for(int i=0;i<logs.length;i++){

            String a=logs[i];

           if(a.equals("../")){
            if(!s.isEmpty()){
                s.pop();
            }
           }else if(!a.equals("./")){
            s.push(a);
           }
    
        }
        return s.size();
        
    }
    public static void main(String[] args) {
        String[] logs={"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));
    }
    
}

import java.util.Stack;

public class leetcode_1598again {
    public static int minOperations(String[] logs) {

        Stack<String> s=new Stack<>();

        for(int i=0;i<logs.length;i++){
            
            if(!(logs[i].equals("../")) && !(logs[i].equals("./"))){
                s.push(logs[i]);
            }
            else if(logs[i].equals("./")){
                continue;
            }else{
                s.pop();
            }
        }
        
        return s.size();

        
    }
    public static void main(String[] args) {
        String[] logs={"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));
    }
    
}

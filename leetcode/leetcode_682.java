import java.util.Stack;

public class leetcode_682 {
    public static int calPoints(String[] operations) {

        Stack<Integer> s=new Stack<>();

        for(int i=0;i<operations.length;i++){
            String str=operations[i];
            
            if(str.equals("C")){
                s.pop();
            }
            else if(str.equals("D")){
               s.push(s.peek()*2);
               
            }else if(str.equals("+")){
                int top2=s.pop();
                int top1=s.pop();
                int putt=top1+top2;
                s.push(top1);
                s.push(top2);
                s.push(putt);

            }else{
                s.push(Integer.parseInt(str));

            }

           

        }
        int sum=0;
        while(!s.isEmpty()){
            sum=sum+s.pop();
        }
        return sum;
        
        
    }
    public static void main(String[] args) {
        String[] operations={"5","2","C","D","+"};
        System.out.println(calPoints(operations));
    }
    
}

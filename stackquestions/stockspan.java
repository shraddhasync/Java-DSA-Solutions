package stackquestions;

import java.util.Arrays;
import java.util.Stack;

public class stockspan {
    public static void stocking(int[] stock, int[] span){
        Stack<Integer> s=new Stack<>();

        s.push(0);
        span[0]=1;

        for(int i=1;i<stock.length;i++){
            int currprice=stock[i];
        
        while(!s.isEmpty() && currprice >= stock[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
            span[i]=i;
        }
        else{
            int prevhigh=s.peek();
            span[i]=i-prevhigh;
        }
        s.push(i);
        }
        System.out.println(Arrays.toString(span));
    }
    public static void main(String[] args) {
        int[] stock={100,80,60,70,60,85,100};
        int[] span=new int[stock.length];

        stocking(stock,span);
    }
    
}

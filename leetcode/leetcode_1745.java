import java.util.Arrays;
import java.util.Stack;

public class leetcode_1745 {
    public static void main(String[] args) {
        int[] prices={8,4,6,2,3};

        Stack<Integer> s=new Stack<>();

        int[] ans=new int[prices.length];

        for(int i=prices.length-1;i>=0;i--){
            int num=prices[i];

            while(!s.isEmpty() && prices[s.peek()] > num){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=prices[i];

            }else{
                ans[i]=prices[i]-prices[s.peek()];
            }
            s.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
    
}

package stackquestions;

import java.util.Arrays;
import java.util.Stack;

public class nextgreaterele {
    public static void nextgret(int[] arr){

        Stack<Integer> s=new Stack<>();
        int[] ans=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];

            while(!s.isEmpty() && arr[i] > arr[s.peek()]){
             s.pop();
            }
            if(s.isEmpty()){
               ans[i]=-1;
            }else{
                ans[i]=arr[s.peek()];
            }
            s.push(i);


        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        nextgret(arr);
    }
    
}

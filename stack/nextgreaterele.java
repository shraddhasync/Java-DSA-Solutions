import java.util.Arrays;
import java.util.Stack;

public class nextgreaterele {
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        int[] ans=new int[arr.length];

        Stack <Integer> s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
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
    
}

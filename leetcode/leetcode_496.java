import java.util.Arrays;
import java.util.Stack;

public class leetcode_496 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans=new int[nums2.length];
        Stack<Integer> s=new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && nums2[s.peek()] < nums2[i]){
                s.pop();

            }
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=nums2[s.peek()];

            }
            s.push(i);
        }

        int[] finalans=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            int curr1=nums1[i];
            for(int j=0;j<nums2.length;j++){
                int curr2=nums2[j];

                if(curr1 == curr2){
                    finalans[i]=ans[j];
                }
            }
        }
        return finalans;
        
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));

        
    }
    
}

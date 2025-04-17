import java.util.Arrays;

public class leetcode_1480 {
    public static void runningSum(int[] nums) {

        int[] ans=new int[nums.length];

        int sum=0;

        for(int i=0;i<nums.length;i++){

            sum=sum+nums[i];
            ans[i]=sum;

            
        }
        System.out.println(Arrays.toString(ans));



    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        runningSum(nums);
        
    }
    
}

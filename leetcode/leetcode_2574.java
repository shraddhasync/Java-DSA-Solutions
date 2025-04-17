import java.util.Arrays;

public class leetcode_2574 {
    public static int[] leftRightDifference(int[] nums) {

        int[] left=new int[nums.length];

        int leftsum=0;
        

        for(int i=0;i<nums.length;i++){

            if( i == 0){
                left[i]=0;
            }

            left[i]=leftsum;
            leftsum=leftsum+nums[i];
            
        }
        

        
        int[] right=new int[nums.length];

        int rightsum=0;
        

        for(int i=right.length-1;i>=0;i--){

            if(i == right.length-1){
                right[i]=0;
            }

            right[i]=rightsum;
            rightsum=rightsum+nums[i];

        }
    

        int[] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++){
           
            ans[i]=Math.abs(left[i]-right[i]);
        }

        return ans;

        
    }
    public static void main(String[] args) {
        int[] nums={10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));

    }
    
}

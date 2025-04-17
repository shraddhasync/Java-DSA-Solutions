import java.util.Arrays;

public class leetcode_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int a=nums[i];

            int count=0;

            for(int j=0;j<nums.length;j++){
                int b=nums[j];

                if(i != j){
                    if( a > b){
                        count++;
                     }
                }
                 

                
            }
             ans[i]=count;


        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    
}

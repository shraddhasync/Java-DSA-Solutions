public class leetcode_3190 {
    public static int minimumOperations(int[] nums) {

        int ans=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i] % 3 != 0){

                if((nums[i]+1) % 3 == 0){
                    ans++;
                }else if((nums[i]-1) % 3 == 0){
                    ans++;
                }
            }
        }

        return ans;
        
    }
    public static void main(String[] args) {
        int[] nums={3,6,9};
        System.out.println(minimumOperations(nums));

        
    }
    
}

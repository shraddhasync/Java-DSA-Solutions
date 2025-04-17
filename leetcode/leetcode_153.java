public class leetcode_153 {

    public static int findMin(int[] nums) {

        int low=0;
        int high=nums.length-1;
        

        while(low <= high){

           int  mid=(low+high)/2;
        

            if(nums[low] > nums[high]){           //we move right
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

    


    }
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};

        System.out.println(findMin(nums));
    
    }
    
}

import java.util.Arrays;

public class leetcode_33 {
   

    public static int search(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;
        int ans=-1;

        while(low <= high){

            int mid=(low+high)/2;

            if(nums[mid] == target){
                 ans=mid;
                 break;
            }
            else if(nums[low] <= nums[mid] ){                      //left sorted

                if(nums[low] <= target && nums[mid] > target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[mid] < target && nums[high] >= target){     //right sorted
                    low=mid+1;
                }else{
                    high=mid-1;
                }                                     
            }
        }
        return ans;

        
    }
    public static void main(String[] args) {
        int[] nums={3,1};
        int target=1;

        int res=search(nums, target);
        System.out.println(res);

    }
    
}

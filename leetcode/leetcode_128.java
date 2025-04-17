import java.util.HashSet;

public class leetcode_128 {
    public static void  longestConsecutive(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            
        }
        
        
    }
    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
        longestConsecutive(nums);
    }
    
}

package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class three_integer_sum {
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        HashSet<List<Integer>> main=new HashSet();

        for(int i=0;i<nums.length-2;i++){

        

            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                

                if(sum == 0){

                    ArrayList<Integer> list=new ArrayList<>();

                          list.add(nums[i]);
                          list.add(nums[j]);
                          list.add(nums[k]);
                          main.add(list);
                          
                          j++;
                          k--;
                    
                          
                    
                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
            }

            


        }
        List<List<Integer>> result=new ArrayList(main);

        return result;
        
        
    }
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
    
}

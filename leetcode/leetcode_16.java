

import java.util.ArrayList;
import java.util.HashMap;

public class leetcode_16 {
    public static int threeSumClosest(int[] nums, int target) {

        ArrayList<Integer> list=new ArrayList<>();



      for(int i=0;i<nums.length;i++){
        int a=nums[i];

        for(int j=i+1;j<nums.length;j++){
            int b=nums[j];

            for(int k=j+1;k<nums.length;k++){
                int c=nums[k];

                int sum=0;
                sum=a+b+c;
                list.add(sum);
            
                

            }

            

        }



      }
      
      

      int min=Integer.MAX_VALUE;
      int numm=0;
      


      for(int i=0;i<list.size();i++){

        int a=list.get(i);
        int diff=target-a;

        if(diff<min){
            min=diff;
            numm=a;

        }

      

      }
      return numm;
      }
    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        int target=1;
      System.out.println(  threeSumClosest(nums,target));
    }
    
}

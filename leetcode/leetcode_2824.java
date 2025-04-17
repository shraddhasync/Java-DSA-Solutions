import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hashing.twosum;

public class leetcode_2824 {
    public static int countPairs(List<Integer> nums, int target) {

        int[] arr=new int[nums.size()];

        for(int i=0;i<nums.size();i++){
            arr[i]=nums.get(i);
        }
        
       for(int j=0;j<arr.length;j++){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
       }

       System.out.println(Arrays.toString(arr));

       int low=0;
       int high=arr.length-1;
       int ind=0;

       while(low <= high){
        int mid=(low+high)/2;
        ind=mid;
        

        if(arr[mid] < target){
            low=mid+1;
        
        }else{
            high=mid-1;
        }
        
       }
       ind=ind-1;
       System.out.println(ind);
    
       
       
       int[] sortarr=new int[ind+1];

       for(int i=0;i<=ind;i++){
         sortarr[i]=arr[i];
       }

       System.out.println(Arrays.toString(sortarr));
       
       
       

       int count=0;
       
       for(int i=0;i<sortarr.length;i++){
           
           int curr=sortarr[i];

             for(int j=i+1;j<sortarr.length;j++){
                int sum=curr + sortarr[j] ;

                if(sum < target){
                    count++;
                
                }
              
           }
        }
    
       return count;
        
    }
    public static void main(String[] args) {
         
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(-6);
        nums.add(2);
        nums.add(5);
        nums.add(-2);
        nums.add(-7);
        nums.add(-1);
        nums.add(-3);
        int target=-2;
        System.out.println( countPairs(nums, target));
        
        
       


    }
    
}

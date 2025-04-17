package twopointer;

import java.util.Arrays;

public class sortsquare {
    public static void main(String[] args) {
        int[] arr={-10,-3,-2,1,4,5};

        int left=0;
        int right=arr.length-1;
      

        int[] ans=new int[arr.length];
        int k=ans.length-1;

        while(left<=right){

            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                k--;
                left++;
            }else{
                ans[k]=arr[right]*arr[right];
                k--;
                right--;
            }
        }
        System.out.println(Arrays.toString(ans));

     
    
      
    }
}


package twopointer;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        
        int[] arr={0,1,0,1,1,1,0,0};

        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;

            }
            else if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    
}

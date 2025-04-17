package twopointer;

import java.util.Arrays;

public class evenodd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        int left=0;
        int right=arr.length-1;

        while(left<right){

            if((arr[left]%2 != 0) && (arr[right]%2 == 0)){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;

            }
            if(arr[left]%2 == 0){
                left++;
            }
            if(arr[right]%2 !=0){
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
     }
    
}

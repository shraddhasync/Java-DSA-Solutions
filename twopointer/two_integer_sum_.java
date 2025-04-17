package twopointer;

import java.util.Arrays;

import hashing.twosum;

public class two_integer_sum_ {
    public static int[] twoSum(int[] numbers, int target) {

        int[] arr=new int[2];

        int left=0;
        int right=numbers.length-1;

        while(left<right){
           

            if((numbers[left]+numbers[right]) == target){
                arr[0]=left+1;
                
                arr[1]=right+1;
               
                break;

                
            }else if((numbers[left]+numbers[right]) > target){
                right--;

            }else{
                left++;
            }
        }
        
        return arr;
        
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,4};
        int target=3;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    
}

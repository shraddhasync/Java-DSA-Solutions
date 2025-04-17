package binarysearch;

public class firstoccurence {
    public static void main(String[] args) {
        int[] arr={5,5,5,5,6,6,7,8,9};
        int target=5;

        int low=0;
        int high=arr.length-1;
        int fo= 0;

        while(low <= high){
            int mid=(low+high)/2;

            if(arr[mid] == target){
                fo=mid;
                high=mid-1;
                
            }else if(arr[mid] > target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(fo);
    }
    
}

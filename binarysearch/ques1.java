package binarysearch;

public class ques1 {
    public static void main(String[] args) {
        int[] arr={-4,-1,3,7,10,11};
        int ele=1;
        int low=0;
        int high=arr.length-1;

        int count=0;

        while(low <= high){
            int mid=(low+high)/2;

            if(arr[mid] == ele){
                System.out.println(mid);
                count++;
                break;
            }
            else if(arr[mid] > ele){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        if(count > 0 ){
            System.out.println("");
        }else{
            System.out.println("no ele found");
        }


        



        
    }
    
}

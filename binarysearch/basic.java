package binarysearch;

public class basic {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=5;

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            
            int mid=(low+high)/2;

            if(arr[mid] == key){
                System.out.println("found at : "+mid);
                break;
            }
            else if(arr[mid] > key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        if(low>high){
            System.out.println("key not found");
        }

    }
    
}

package rearray;

import java.util.Arrays;

public class reversearraywihtoutextraspace {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;

        for(int i=0;i<arr.length/2;i++){
            arr[i]=arr[i]+arr[n-1];
            arr[n-1]=arr[i]-arr[n-1];
            arr[i]=arr[i]-arr[n-1];
            n--;
           
        }
        System.out.println(Arrays.toString(arr));
        





    }
    
}

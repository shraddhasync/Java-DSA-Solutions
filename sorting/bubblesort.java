package sorting;

import java.util.Arrays;

//in bubble sort we re doing soo many swaps unnnecessarily rather putting elem at right permanent position.
public class bubblesort {
    public static int[] sorting(int arr[]){

       for(int turn=0;turn<arr.length-1;turn++){    //array run till no. oof array elem

        for(int j=0;j<=arr.length-2;j++){           //each turn will run upto last second elem as its last position to swap position
            if(arr[j]>arr[j+1]){
                arr[j]=arr[j]+arr[j+1];
                arr[j+1]=arr[j]-arr[j+1];
                arr[j]=arr[j]-arr[j+1];

            }
        }
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2,7,3,66,99,21,67,3};
        System.out.println(Arrays.toString(sorting(arr)));
    }
    
}

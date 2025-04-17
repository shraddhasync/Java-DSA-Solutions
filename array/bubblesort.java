package array;

import java.util.Arrays;
import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enetr size of array: ");
        int n=sc.nextInt();

        int number[]=new int[n];

         for(int i=0;i<n;i++){
            System.out.println("enter ele: ");
            number[i]=sc.nextInt();
         }


        for(int j=0;j<n;j++){
            for(int i=0;i<n-1;i++){
                if(number[i]>number[i+1]){
                    int temp=number[i];
                    number[i]=number[i+1];
                    number[i+1]=temp;
                }
            }
        }
         
         System.out.println(Arrays.toString(number));


    
    }
    
}

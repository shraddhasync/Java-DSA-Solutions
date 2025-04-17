package array;

import java.util.Arrays;
import java.util.Scanner;
public class printarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter size of array: ");
        int n=sc.nextInt();

        int numbers[]=new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            System.out.println("enter element: ");
            numbers[i]=sc.nextInt();
            sum=sum+numbers[i];

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("sum of elements: "+sum);
        System.out.println("mean of array is: "+sum/n);
    }
    
}

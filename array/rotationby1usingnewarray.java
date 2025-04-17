package array;

import java.util.Arrays;
import java.util.Scanner;
public class rotationby1usingnewarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        System.out.println("enter size: ");
        int n=sc.nextInt();

        int number[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter ele: ");
            number[i]=sc.nextInt();
        }


        int number2[]=new int[n];

        number2[0]=number[n-1];
        
        for(int i=0;i<=(n-2);i++){
            number2[i+1]=number[i];
        }


        System.out.println(Arrays.toString(number2));


        
    }
}
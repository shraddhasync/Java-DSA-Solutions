package array;

import java.util.Arrays;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size: ");
        int n=sc.nextInt();

        int number[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enetr ele: ");
            number[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(number));
        int number2[]=new int[n];

        
            for(int j=0;j<=number2.length-1;j++){
                number2[j]=number[n-1];
                n--;
            }
        
        System.out.println(Arrays.toString(number2));



    }
    
}

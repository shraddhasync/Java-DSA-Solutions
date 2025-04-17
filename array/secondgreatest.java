package array;

import java.util.Scanner;
public class secondgreatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enetr size of array: ");
        int n=sc.nextInt();

        int numbers[]=new int[n];
        int maxnum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            System.out.println("enter element: ");
            numbers[i]=sc.nextInt();
            if(maxnum>numbers[i]){
                maxnum=i;
            }
        }
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(i!=maxnum){
                secondmax=numbers[i];
            }


        }
        System.out.println(secondmax);
    }
}
package reloop;
import java.util.Arrays;
import java.util.Scanner;
public class reversewitharray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size: ");
        int n=sc.nextInt();

        int number[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter num: ");
            number[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(number));

        int number2[]=new int[n];

        for(int i=0;i<n;i++){        //yaha n+3 kyu likha 
            number2[i]=number[n-1];
            n--;
            
        }
        System.out.println(Arrays.toString(number2));
        
        
    }
    
}

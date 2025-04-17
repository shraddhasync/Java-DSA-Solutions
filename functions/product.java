package functions;

import java.util.Scanner;

public class product {
    public static  int productof(int a,int b){
        
        int product=a*b;
        return product;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int product=productof(a,b);
        System.out.println(product);

        product=productof(10,20);
        System.out.println(product);


        
    }
    
}

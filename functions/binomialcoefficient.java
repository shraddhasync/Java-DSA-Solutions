package functions;

import java.util.Scanner;


public class binomialcoefficient {
    public static int bincoeff(int n,int r){
        int factn=1;

        for(int a=1;a<=n;a++){
            factn=factn*a;
        }
        System.out.println(factn);

        int factr=1;

        for(int b=1;b<=r;b++){
            factr=factr*b;
        }
        System.out.println(factr);

        int factnr=1;

        for(int c=1;c<=(n-r);c++){
            factnr=factnr*c;
        }
        System.out.println(factnr);

        int nCr =factn/(factr*factnr);
        return nCr;

    }
    public static void main(String[] args) {

        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        

        int binc=bincoeff(n,r );
        System.out.println(binc);

        
    }
}

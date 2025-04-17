package rearray;

import java.util.Arrays;

public class rotationbykwithoutarray {
    public static void main(String[] args) {
        
    
    int num1[]={1,2,3,4,5};
       int n=5;
        
       int k=2;
       for(int j=1;j<=k;j++){
       int temp=num1[n-1];
       for(int i=n-1;i>0;i--){
        num1[i]=num1[i-1];

       }
       num1[0]=temp;
    }
       System.out.println(Arrays.toString(num1));
    }
    
}

package rearray;

import java.util.Arrays;

public class reversewithoutnewarray {
    public static void main(String[] args) {

        
        
        int num1[]={1,2,3,4,5};
        int n=5;

        for(int i=0;i<num1.length/2;i++){
            int temp=num1[i];
            num1[i]=num1[n-1];
            num1[n-1]=temp;
            n--;
        }
        System.out.println(Arrays.toString(num1));
    }
    
}

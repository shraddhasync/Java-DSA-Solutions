package rearray;

import java.util.Arrays;

public class leftrotationby1 {
    public static void main(String[] args) {
        int num1[]={1,2,3,4,5};

        int  num2[]=new int[5];

        num2[0]=num1[4];

        for(int i=0;i<5-1;i++){
            num2[i+1]=num1[i];
        }
        System.out.println(Arrays.toString(num2));
        
    }
    
}

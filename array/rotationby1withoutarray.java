package array;

import java.util.Scanner;
import java.util.Arrays;

public class rotationby1withoutarray {
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};

        

        int k=3;


        for(int j=1;j<=k;j++){
            int temp=number[0];
            for(int i=0;i<=3;i++){
                number[i]=number[i+1];
    
            }
            number[4]=temp;
        }
        System.out.println(Arrays.toString(number));

        
    }
    

    

    
}

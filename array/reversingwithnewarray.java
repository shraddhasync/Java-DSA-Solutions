package array;

import java.util.Arrays;

public class reversingwithnewarray {
    public static void main(String[] args) {
        
        int number[]={1,2,3,4,5};

        int number2[]=new int[5];

        for(int i=0;i<5;i++){
            number2[i]=number[5-(i+1)];
        }
        System.out.println(Arrays.toString(number2));
    }
    
}

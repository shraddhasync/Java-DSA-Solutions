package array;

import java.util.Arrays;

public class reversingwithoutnewarray {
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};

        for(int i=0;i<=4;i++){
            number[i]=number[4-i];
        }
        System.out.println(Arrays.toString(number));
    }
    
}

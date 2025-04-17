package rearray;

import java.util.Arrays;

public class prefixarray {                   //in prefix method we used only 2 loop instead of 3 unlike brute force method,this cause decrease in time complexity by n )
                                             //brute time complexity=O(n^3) ,  prefix time complexity=O(n^2)
    public static void sumofarray(int number[]){
        int max=Integer.MIN_VALUE;
        
        for(int i=1;i<number.length;i++){
            number[i]=number[i-1]+number[i];
        }
        System.out.println(Arrays.toString(number));

        for(int i=1;i<number.length;i++){
            int start=i;
            
            for(int j=i;j<number.length;j++){
                int end=j;

             int sum=0;
             sum= number[end]-number[start-1];            //formula to find sum directly:  prefix[end]=prefix[start-1]
             if(sum>max){
                max=sum;
             }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        sumofarray(number);
    }
    
}

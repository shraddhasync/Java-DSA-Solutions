package rearray;

import java.util.Arrays;

public class kadane {
    public static void kadanes(int num[]){
        int max=Integer.MIN_VALUE;

        for(int i=1;i<num.length;i++){
            num[i]=num[i-1]+num[i];
        }
        System.out.println(Arrays.toString(num));

        for(int i=1;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                
                int sum=0;
                sum=num[end]-num[start-1];
                if(sum>=0){
                    if(sum>max){
                        max=sum;

                    }
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);

    }
    
    
}

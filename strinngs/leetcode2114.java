package strinngs;

import java.util.Arrays;

public class leetcode2114{
    public static void main(String[] args) {
        String[] arry={"i am here","i am here now,","all are given to do this alright","hey there"};
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arry.length;i++){
            String[] newarry=arry[i].split(" ");
            
            int check=newarry.length;

            if(check>max){
                max=check;
            }
        }
        System.out.println(max);

    }
    
}
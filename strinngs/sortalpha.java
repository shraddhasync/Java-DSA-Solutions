package strinngs;

import java.util.Arrays;

public class sortalpha {
    public static void main(String[] args) {
        String str="her Name is Kitty";

        str = str.toLowerCase();          //to ignore A and a ASCII values

        String[] arry=str.split(" ");

        for(int j=0;j<arry.length-1;j++){
        for(int i=0;i<arry.length-1;i++){
            if(arry[i].charAt(0)>arry[i+1].charAt(0)){
                String temp=arry[i];
                arry[i]=arry[i+1];
                arry[i+1]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(arry));





      

    }
    
}

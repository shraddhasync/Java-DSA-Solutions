package strinngs;

import java.util.Arrays;

public class frequencyy {
    public static void main(String[] args) { 
        
        String str="apple";

       int[] arry=new int[26];

       for(int i=0;i<str.length();i++){
        int index=(int)(str.charAt(i)-97);
        arry[index]++;
     }
     System.out.println(Arrays.toString(arry));

     for(int i=0;i<arry.length;i++){
        char alpha=(char)(i+97);
        if(arry[i]!=0){
        System.out.println(alpha+" "+" "+arry[i]);
        }
     }
        
    }        
}
    


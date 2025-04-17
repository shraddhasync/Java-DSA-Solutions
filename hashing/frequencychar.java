package hashing;

import java.util.*;
public class frequencychar {
    public static void main(String[] args) {
        char[] chararr = {'a', 'c', 'c', 'd','d', 'e' , 'c'};

        HashMap <Character,Integer> map=new HashMap<>();
        

        for(int i=0;i<chararr.length;i++){
            if(map.containsKey(chararr[i])){
                int oldf=map.get(chararr[i]);
                int newf=(oldf+1);
                map.put(chararr[i], newf);
                System.out.println(chararr[i]+" "+newf);
               

            }else{
                map.put(chararr[i],1);
                System.out.println(chararr[i]+" "+1);
            }
            
        }
        int maxf=map.get(chararr[0]);
        char maxfc=chararr[0];
        for(int i=0;i<chararr.length;i++){
            if(map.get(chararr[i]) > maxf){
             maxf =map.get(chararr[i]);
             maxfc=chararr[i];
            }

        }
        System.out.println(maxfc+" = "+maxf);

    
    }
}

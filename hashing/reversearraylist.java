package hashing;

import java.util.ArrayList;

public class reversearraylist {
    public static void main(String[] args) {
        
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        int loop=list.size();
        for(int i=0;i<list.size()/2+1;i++){
            int temp=list.get(i);
            
            list.set(i,list.get(loop-1));
            
            list.set(loop-1,temp);
            loop--;
        }
        System.out.println(list);
        
        
       
    }
    
}

package hashing;

import java.util.ArrayList;

public class removeduplicate {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(2);

        ArrayList <Integer> newlist=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(!(newlist.contains(list.get(i)))){
                newlist.add(list.get(i));
            }
        }
        System.out.println(newlist);
        

        

    }
    
}

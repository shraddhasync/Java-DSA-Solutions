package hashing;
import java.util.ArrayList;
import java.util.Collections;

public class basicarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();

        //add element
        list.add(0);       //list.add(element value)
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get element
        int elem=list.get(2);        //list.get(index)
        System.out.println(elem);

        //delete element
        list.remove(2);              //list.remove(index)
        System.out.println(list);

        //add element in btwn
        list.add(1,7);       //list.add(index,value)
        System.out.println(list);

        //size of arraylist
        int size=list.size();
        System.out.println(size);

        //loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        //sorting
        Collections.sort(list);             //to use this function of  .sort()  we need to use 'collections' class and also import as libraray
        System.out.println(list);
        

    }
    
}

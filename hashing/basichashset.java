package hashing;
import java.util.HashSet;
import java.util.Iterator;

import pattern.v;

public class basichashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();    //hashsets do have indexes,containn elements in sorted manner

        //add elements 
        set.add(1);
        set.add(4);
        set.add(6);
        set.add(2);
        set.add(4);          //do not carry duplicate elements
        System.out.println(set);

        //delete
        set.remove(6);
        System.out.println(set);

        //search
        set.contains(8);           //it is a boolean function
        if(set.contains(8)){
            System.out.println("yes it does");
        }
        else{
            System.out.println("it does not");
        }

        //size
        System.out.println(set.size());

        //iterator(iterator is for example the 'i' in loops that traverse and is a variable)(for this we use a library)
        Iterator it=set.iterator();

                                                          //.hasNext() is a boolean function ,which tell if there exist a next element
        while(it.hasNext()){                              //.next() is a function that return next element
            System.out.println(it.next());
        }



    }

    
}

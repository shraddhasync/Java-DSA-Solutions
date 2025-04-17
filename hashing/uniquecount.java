package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class uniquecount {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("apple");

        HashSet <String> set=new HashSet<>(list);
        System.out.println(set.size());


    }
    
}

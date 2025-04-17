package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class uniquestring {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("banana");
        list.add("orange");

        HashSet  <String> set=new HashSet<>(list);
        System.out.println(set);
    }
    
}

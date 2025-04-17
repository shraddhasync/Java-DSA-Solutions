package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class onlyelem {
    public static void main(String[] args) {
        HashSet <Character> set1=new HashSet<>();

        set1.add('a');
        set1.add('b');
        set1.add('c');
        set1.add('d');

        HashSet <Character> set2=new HashSet<>();

        set2.add('c');
        set2.add('d');
        set2.add('e');
        set2.add('f');

        HashSet <Character> set3=new HashSet<>();

        for(char a: set1){
            if(!(set2.contains(a))){
                set3.add(a);
            }
        }
        for(char a:set2){
            if(!(set1.contains(a))){
                set3.add(a);
            }
        }
        System.out.println(set3);
    }
}
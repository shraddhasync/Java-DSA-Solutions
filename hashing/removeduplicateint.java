package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class removeduplicateint {
    public static void main(String[] args) {
        ArrayList <Integer> one=new ArrayList<>();
        one.add(1);
        one.add(2);
        one.add(3);
        one.add(4);
        one.add(5);
        ArrayList <Integer> two=new ArrayList<>();
        two.add(3);
        two.add(4);
        two.add(5);
        two.add(6);
        two.add(7);

        HashSet <Integer> set=new HashSet<>();

        for(int a: one){
            set.add(a);
        }
        for(int a: two){
            set.add(a);
        }
        ArrayList <Integer> newans=new ArrayList<>(set);
        System.out.println(newans);

    }
    
}

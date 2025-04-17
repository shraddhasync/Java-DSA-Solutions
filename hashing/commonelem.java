package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class commonelem {
    public static void main(String[] args) {
        HashSet <String> set1=new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");

        HashSet <String> set2=new HashSet<>();
        set2.add("banana");
        set2.add("date");
        set2.add("apple");

        ArrayList <String> al=new ArrayList<>();

        for(String a:set1 ){
            al.add(a);
        }
        for(String a:set2 ){
            al.add(a);
        }
        int count=0;
        for(int i=0;i<al.size();i++){
            String a=al.get(i);
            for(int j=i+1;j<al.size();j++){
                String b=al.get(j);
                if(a == b){
                    count++;
                }
                
            }
        }
        if(count > 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}

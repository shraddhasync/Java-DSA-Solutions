package hashing;
import java.util.ArrayList;
import java.util.HashSet;
public class uniqueelem {
    public static void main(String[] args) {
        ArrayList <Integer> one=new ArrayList<>();
        ArrayList <Integer> two=new ArrayList<>();

        one.add(1);
        one.add(2);
        one.add(3);
        one.add(4);
        one.add(5);

        two.add(3);
        two.add(4);
        two.add(5);
        two.add(6);
        two.add(7);

        HashSet <Integer> set=new HashSet<>();

        for(int i=0;i<one.size();i++){
            int a=one.get(i);
            set.add(a);
            int b=two.get(i);
            set.add(b);
        }
        ArrayList <Integer> list=new ArrayList<>(set);

        System.out.println(list);
        


    }
    
}

package hashing;
import java.util.ArrayList;
public class removeduplicatechar {
    public static void main(String[] args) {
        ArrayList <Character> list=new ArrayList<>();
        list.add('b');
        list.add('a');
        list.add('c');
        list.add('a');
        list.add('b');

        boolean[] arr=new boolean[26];
        ArrayList <Character> newlist=new ArrayList<>();

        

        for(int i=0;i<list.size();i++){

            char ch=list.get(i);
            int index=ch-'a';
            if(arr[index] != true){
                newlist.add(ch);
                arr[index]=true;
            }


            
        }
        System.out.println(newlist);
    }
    
}

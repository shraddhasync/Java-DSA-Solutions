package hashing;
import java.util.ArrayList;
public class sortalphabetically {
    public static void main(String[] args) {
        
        ArrayList <String> list=new ArrayList<>();

        list.add("banana");
        list.add("apple");
        list.add("cherry");
        list.add("date");
        System.out.println(list);

        for(int i=0;i<list.size();i++){

            for(int j=0;j<list.size()-1;j++){
                String str1=list.get(j);
                String str2=list.get(j+1);

                if(str1.charAt(0) > str2.charAt(0)){
                    String temp=list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        System.out.println(list);
    }
    
}

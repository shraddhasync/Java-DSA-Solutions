package hashing;
import java.util.*;

public class basichashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();

        //add elements(key,value)
        map.put("india",120);
        map.put("china",230);
        map.put("russia",445);
        System.out.println(map);

        //search
        if(map.containsKey("indonasia")){
            System.out.println("it does");
        }else{
            System.out.println("it does not");
        }

        //delete
        map.remove("china");
        System.out.println(map);

        //get some value of a key
        System.out.println(map.get("indonaia"));         //return null if not exist
        System.out.println(map.get("india"));            //return that value of key if exist

        

        //another way to write 'for' loop
        int arr[]={1,2,3,4,5,6};

        for(int val : arr){
            System.out.println(val);
        }

        //using above way of  'for' loop we iterate all pairs of map 
        for(Map.Entry<String , Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
    }
    
}

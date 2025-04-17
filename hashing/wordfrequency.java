package hashing;

import java.util.*;
public class wordfrequency {
    public static void main(String[] args) {

        String str="In VS Code if I type and then press enter it will generate a paragraph of lorem ipsum. The only problem is that the paragraph comes out as one very long line of text as type opposed to type several lines in the text editor. Is type there a setting I can change type so that it automatically type generates my lorem";

        HashMap <String,Integer> map=new HashMap<>();

        String[] arr=new String[str.length()];

        for(int i=0;i<str.length();i++){
             arr=str.split(" ");
            
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                
                int oldf=map.get(arr[i]);
                int newf=(oldf+1);
                map.put(arr[i], newf);
                System.out.println(arr[i]+"="+newf);

            }else{
                map.put(arr[i],1);
                System.out.println(arr[i]+"="+1);
            }
        }
    




    }
    
}

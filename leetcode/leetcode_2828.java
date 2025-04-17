import java.util.ArrayList;
import java.util.List;

public class leetcode_2828 {
    public static Boolean  isAcronym(List<String> words, String s) {

        String ans="";

        for(int i=0;i<words.size();i++){

            String x=words.get(i);
            ans=ans.concat(String.valueOf(x.charAt(0)));

        }
        
        
        if(ans.equals(s) == true){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        String s="a";
        ArrayList<String> words=new ArrayList<>();
        words.add("an");
        words.add("apple");
    
        

        System.out.println(isAcronym(words,s));
    }
    
}

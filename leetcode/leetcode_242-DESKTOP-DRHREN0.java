import java.util.HashMap;

public class leetcode_242 {
    public static Boolean isAnagram(String s, String t) {

        if(s.length() == t.length()){
            HashMap<Character,Integer> maps=new HashMap<>();
        HashMap<Character,Integer> mapt=new HashMap<>();

        for(int i=0;i<s.length();i++){

            if(maps.containsKey(s.charAt(i))){
                int oldf=maps.get(s.charAt(i));
                int newf=oldf+1;
                maps.put(s.charAt(i),newf);

            }else{
                maps.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){

            if(mapt.containsKey(t.charAt(i))){
                int oldf=mapt.get(t.charAt(i));
                int newf=oldf+1;
                mapt.put(t.charAt(i),newf);

            }else{
                mapt.put(t.charAt(i),1);
            }
        }
        
        if(maps.equals(mapt)){
            return true;
        }else{
            return false;
        }



        }
        else{
            return false;
        }


    }
    public static void main(String[] args) {
        String s="a";
        String t="ab";
        System.out.println(isAnagram(s, t));
    }
    
}

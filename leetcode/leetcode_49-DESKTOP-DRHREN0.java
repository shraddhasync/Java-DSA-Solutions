import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class leetcode_49 {

    public static List<List<String>> anagramGroups(String[] strs){

        List<List<String>> mainlist =new ArrayList<>(); 

        HashSet<String> set = new HashSet<>();

        for(int i=0;i<strs.length;i++){

            if(set.contains(strs[i]))continue;

            String one=strs[i];

            List<String> listi=new ArrayList<>();
            
            listi.add(one);

            set.add(one);

            for(int j=i+1;j<strs.length;j++){
                String two=strs[j];

                if(ifAnagram(one, two) == true){
                    listi.add(two);

                    set.add(two);
                }
            }
            
            mainlist.add(listi);

        }
        return mainlist;

    }
    public static Boolean ifAnagram(String x,String y){

        if(x.length() == y.length()){

            HashMap<Character,Integer> mapx=new HashMap<>();
            HashMap<Character,Integer> mapy=new HashMap<>();
    
            for(int i=0;i<x.length();i++){
    
                if(mapx.containsKey(x.charAt(i))){
    
                    int oldf=mapx.get(x.charAt(i));
                    int newf=oldf+1;
    
                    mapx.put(x.charAt(i),newf);
                }else{
                    mapx.put(x.charAt(i),1);
                }
            }
    
            for(int i=0;i<y.length();i++){
    
                if(mapy.containsKey(y.charAt(i))){
    
                    int oldf=mapy.get(y.charAt(i));
                    int newf=oldf+1;
    
                    mapy.put(y.charAt(i),newf);
                }else{
                    mapy.put(y.charAt(i),1);
                }
            }

            if(mapx.equals(mapy)){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};     // [["bat"],["nat","tan"],["ate","eat","tea"]]
        anagramGroups(strs);

    }
    
}

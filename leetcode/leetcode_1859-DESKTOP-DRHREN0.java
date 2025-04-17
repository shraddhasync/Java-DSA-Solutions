import java.util.Arrays;

public class leetcode_1859 {
    public static String sortSentence(String s) {
    
        String[] arr=s.split(" ");

       String[] newarr=new String[arr.length];

       
        int z=0;
        int y=0;

        while(z < arr.length){
            if(Integer.valueOf(String.valueOf(arr[y].charAt(arr[y].length()-1))) == z+1){
                newarr[z]=arr[y];
                z++;
                y=0;
            }else{
                y++;
            }
        }

        for(int i=0;i<newarr.length;i++){
            newarr[i]=newarr[i].replace(String.valueOf(newarr[i].charAt(newarr[i].length()-1)),"");
        }
        
        String ans="";
        for(int i=0;i<newarr.length;i++){
            ans=ans.concat(newarr[i]);
            if(i != newarr.length-1){
                ans=ans.concat(" ");
            }
           
        }
        return ans;

 

    }
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    
}

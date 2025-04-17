import java.util.Arrays;

public class leetcode_1684 {
    public static void countConsistentStrings(String allowed, String[] words) {

        int[] arr=new int[words.length];

        for(int i=0;i<words.length;i++){
            String x=words[i];

            int count=0;
            for(int j=0;j<allowed.length();j++){
                char y=allowed.charAt(j);

                for(int k=0;k<x.length();k++){
                    char z=x.charAt(k);

                    if(y == z){
                        count++;
                        break;
                    }
                }
            }

            if(count == allowed.length()){
                arr[i]=1;
            }
        }

        System.out.println(Arrays.toString(arr));
        
    }
    public static void main(String[] args) {
        String allowed="cad";
        String[] words={"cc","acd","b","ba","bac","bad","ac","d"};
        countConsistentStrings(allowed,words);
    }
    
}

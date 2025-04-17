public class leetcode_2744 {
    public static void maximumNumberOfStringPairs(String[] words) {

        int count=0;

        for(int i=0;i<words.length;i++){
            String x=words[i];

            for(int j=i+1;j<words.length;j++){
                String y=words[j];

                if(ifopp(x,y) == true){
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
    public static Boolean ifopp(String x,String y){

        String z="";
        for(int i=y.length()-1;i>=0;i--){
            z=z.concat(String.valueOf(y.charAt(i)));
        }

        if(x.equals(z)){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        String[] words={"ab","ba","cc"};
        maximumNumberOfStringPairs(words);
    }
    
}

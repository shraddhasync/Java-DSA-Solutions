public class leetcode_3146 {
    public static int findPermutationDifference(String s, String t) {


        int sum=0;

        for(int i=0;i<s.length();i++){

            int num=0;
            for(int j=num;j<t.length();j++){

                if(s.charAt(i) == t.charAt(j)){
                    int diff=Math.abs(i)-Math.abs(j);
                    
                    sum=Math.abs(sum)+Math.abs(diff);
                   
                }

            }
            num=0;

        }
        return sum;

        
        
    }
    public static void main(String[] args) {
        String s="abcde";
        String t="edbac";
        System.out.println( findPermutationDifference(s, t));
    }
    
}

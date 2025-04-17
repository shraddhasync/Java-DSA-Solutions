public class leetcode_1221 {
    public static int balancedStringSplit(String s) {

        int r=0;
        int l=0;
        int count=0;
    
    


        for(int i=0;i<s.length();i++){
            

            

            if(s.charAt(i) == 'R'){
                r++;
               
            }
            else if(s.charAt(i) == 'L'){
                l++;
               
            }

            if(r == l){
                count++;
                
            }



        }
        return count;


        
    }
    public static void main(String[] args) {
        
        String s="LLLLRRRR";
       System.out.println( balancedStringSplit(s));
    }
    
}

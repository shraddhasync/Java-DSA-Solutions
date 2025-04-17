public class leetcode_2810 {
    
    public static String reversing(String a) {

        String c="";
        for(int i=a.length()-1;i>=0;i--){
            c=c.concat(String.valueOf(a.charAt(i)));
        }
        return c;
    }

    
    public static String finalString(String s) {

    int i=0;
    String a="";
    String b="";

    while(i<s.length()){
       
        if(s.charAt(i) != 'i'){
            a=a.concat(String.valueOf(s.charAt(i)));
           
            i++;

        }
        else{
          
            a=reversing(a);
            
            i++;
        }
    }
    return a;


        
    }
    public static void main(String[] args) {
        String s="poiinter";
        System.out.println(finalString(s));
    }
    
}

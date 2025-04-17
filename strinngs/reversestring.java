package strinngs;

public class reversestring {
    public static void main(String[] args) {
        String str="apple";
        
        for(int i=str.length()-1 ;i>=0 ;i--){
            System.out.println(str.charAt(i));
        }
    }
    
}

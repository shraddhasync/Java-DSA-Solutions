package strinngs;

public class countvowelandconsonent {
    public static void main(String[] args) {
        String str="manggo";
        int consonent=0;
        int vowel=0;
       
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U'){
                vowel=vowel+1;
                
            }
            else{
                consonent=consonent+1;
               
                
            }
        }
        System.out.println(vowel);
        System.out.println(consonent);
    }
    
}

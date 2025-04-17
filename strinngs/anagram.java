package strinngs;

public class anagram { 
    public  static boolean checkif(String str1,String str2){

        int count=0;
        while(count<str1.length() || count<str2.length()){
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
                j++;
            }
        }
        }
    
        if(count==str1.length()-1 && count==str2.length()-1){
            return true;
        }
        else{
            return false;
        }
    }         
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        System.out.println(checkif(str1,str2));
    }
    
}
    

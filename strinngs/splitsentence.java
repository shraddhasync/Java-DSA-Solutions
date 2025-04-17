package strinngs;

public class splitsentence {
    public static void main(String[] args) {
        String str="her name iss sharddha";

        String[] words=str.split(" ");

        for(int i=0;i<words.length;i++){
            words[i]=words[i].substring(0,1).toUpperCase()+words[i].substring(1);
        }
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
    
}

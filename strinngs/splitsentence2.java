package strinngs;

public class splitsentence2 {
    public static void main(String[] args) {
        
            String str="her name is sharddha";
    
            String[] words=str.split(" ");
    
            for(int i=0;i<words.length;i++){
                words[i]=words[i].substring(0,1).toUpperCase()+words[i].substring(1,words[i].length()-1)+words[i].substring(words[i].length()-1,words[i].length()).toUpperCase();
            }
            for(int i=0;i<words.length;i++){
                System.out.print(words[i]+" ");
            }
        }
    }
    


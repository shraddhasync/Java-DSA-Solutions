package strinngs;

public class countpref {
    public static void main(String[] args) {
        String[] words={"pay","attention","attend","practice"};
        String pref="at";
        int check=0;

        for(int i=0;i<words.length;i++){
            if(words[i].startsWith("at")){
                check++;
            }
        }
        System.out.println(check);
        
    }
}

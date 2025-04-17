package strinngs;

public class startswith2 {
    public static void main(String[] args) {
        String[] words={"pay","attention","practice","attend"};

        String prefix="at";
        int check=0;
        System.out.println(words.length);

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                while( prefix.length()>words[i].length()){
                    if(prefix==words[i]){
                        check++;
                    }


                }
            }
            System.out.println(check);
    }
        }
    }
        
    


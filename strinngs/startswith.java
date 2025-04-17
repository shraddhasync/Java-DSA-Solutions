package strinngs;
import java.util.Arrays;
import java.util.Scanner;

public class startswith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] words=new String[5];

        for(int i=0;i<words.length;i++){
            System.out.println("enter String: ");
            words[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(words));

        System.out.println("enter prefix: ");
        String pref=sc.nextLine();

        int check=0;

        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){ //this boolean method it used to check if a substring exists or not in a string
                check++;
            }
        }
        System.out.println(check);




    }
    
}

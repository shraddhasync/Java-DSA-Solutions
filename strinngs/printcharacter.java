package strinngs;

import java.util.Scanner;
public class printcharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter string: ");
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }

    }
    
}

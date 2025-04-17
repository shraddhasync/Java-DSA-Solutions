package reloop;
import java.util.Scanner;
public class strongnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter num: ");
        int e=sc.nextInt();
        int n=e;

        
        int ans=0;

        while(n!=0){
            int lastdigit=n%10;
            int mul=1;                    //why to initialize inside while loop,why not outside loop
        for(int i=1;i<=lastdigit;i++){
            mul=mul*i;
           
        }
        ans=ans+mul;
        n=n/10;
        }
        if(e==ans){
            System.out.println("strong");
        }else{
            System.out.println("not strong");
        }
        
    }
    
}

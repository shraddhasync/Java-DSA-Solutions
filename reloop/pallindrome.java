package reloop;

public class pallindrome {
    public static void main(String[] args) {
        int e=12361;
        int n=e;
        int ans=0;

        while(n!=0){
            int lastdigit=n%10;
            ans=ans*10+lastdigit;
            n=n/10;

        }
        System.out.println(ans);

        if(ans==e){
            System.out.println("pallindrome");
        }else{
            System.out.println("not pallinndrome");
        }
    }
    
}

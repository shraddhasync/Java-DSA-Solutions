package reloop;

public class printreverse {
    public static void main(String[] args) {
        int n=123;

        int ans=0;

        while(n!=0){
            int lastdigit=n%10;
            ans=ans*10+lastdigit;
            n=n/10;
        }
        System.out.println(ans);
    }
    
}

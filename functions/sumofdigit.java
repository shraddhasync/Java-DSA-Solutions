package functions;


public class sumofdigit {
    public static void sumofdigits(int n){
        int ans=0;

        while(n!=0){
            int lastdigit=n%10;
            ans=ans+lastdigit;
            n=n/10;

        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        int n=1234;
        sumofdigits(n);
        
    }
    
}

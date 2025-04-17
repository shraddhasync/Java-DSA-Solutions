package reloop;

public class sumofdigit {
    public static void main(String[] args) {
        int n=4354;
        int ans=0;

        while(n!=0){
            int lastdigit=n%10;
            ans=ans+lastdigit;
            n=n/10;

        }
        System.out.println(ans);
    }
    
}

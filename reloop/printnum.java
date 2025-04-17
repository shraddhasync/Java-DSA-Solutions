package reloop;

public class printnum {
    public static void main(String[] args) {
        
        int n=123;

        int ans=0;

        while(n!=0){
            int lastdigit=n%10;
            ans=ans*10+lastdigit;
            n=n/10;
        }

        int newans=0;
        while(ans!=0){
            int lastdigitt=ans%10;

            newans=newans*10+lastdigitt;
            ans=ans/10;

        }
        while(newans!=1){
            int lastdigittt=newans%10;
            System.out.println(lastdigittt);
            newans=newans/10;
        }
        System.out.println(newans);
        
            
    }
    
}

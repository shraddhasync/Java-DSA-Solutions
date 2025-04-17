package functions;

public class pallindrome {
    public static void ifpallindrome(int e){
        int n=e;
        int num=0;

        while(n!=0){
            int lastdigit=n%10;
            num=num*10+lastdigit;
            n=n/10;

        }
        if(e==num){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }

    }
    public static void main(String[] args) {
        int e=121;
        ifpallindrome(e);
        
    }
    
}

package bitwisee;

public class swap {
    public static void main(String[] args) {
        int n=12;
        int m=8;
        
        n=n ^ m;
        m=n ^ m;
        n=n ^ m;
        System.out.println("n: "+n);
        System.out.println("m: "+m);
        System.out.println(~2);


    }
    
}

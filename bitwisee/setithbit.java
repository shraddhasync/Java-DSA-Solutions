package bitwisee;

public class setithbit {
    public static void main(String[] args) {
        int n=10;   
        int i=2;
        
        int bitmask=1<<i;
        n=n | bitmask;
        System.out.println(n);
        
        
    }
    
}

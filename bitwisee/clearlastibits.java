package bitwisee;

public class clearlastibits {
    public static void main(String[] args) {
        int n=15;
        int i=2;

        int bitmask=(~(0))<<i;   //~0 = -1
        int newnum=n & bitmask;
        System.out.println(newnum);

    
    }
    
}

package bitwisee;

public class clearirangebits {
    public static void main(String[] args) {
        int n=10;
        int i=2;
        int j=4;

        int a=((~0)<<(j+1));
        int b=(1<<i)-1;

        int bitmask=a | b;
        int newnum=n & bitmask;
        System.out.println(newnum);

    }
    
}

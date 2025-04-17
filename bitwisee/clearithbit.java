package bitwisee;

public class clearithbit {
    public static void main(String[] args) {
        int n=5;
        int i=2;

        int bitmask=1<<i;
        int notbitmask=~(bitmask);
        int newnum=n & notbitmask;
        System.out.println(newnum);
    }
    
}
//clear ith bit= make all bits 0
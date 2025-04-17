package bitwisee;

public class updateithbit {
    public static void main(String[] args) {
        int n=5;
        int i=1;

        int bitmask=1<<i;

        int newnum=n | bitmask;
        System.out.println(newnum);
    }
    
}
//to covert ith bit in 0(clear)=    bitmask=1<<i
                                 // ~(bitmask)
                                 // given num & ~(bitmask)

//to convert ith bit in 1(set)=    bitmask=1<<i
                                // given num | bitmask


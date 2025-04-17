package recursion;

public class naturalsum {
    public static int printsum(int n){
        if(n == 0){
            return 0;
        }

        int sumtill=printsum(n-1);
        int sum=printsum(n-1) + n;
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printsum(n));
    }
    
}

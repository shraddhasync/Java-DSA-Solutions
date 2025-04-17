package recursion;

public class fibonacci {
    public static int printfib(int n){

        if(n==0 || n==1){
            return n;
        }

        int fibn_2=printfib(n-2);
        int fibn_1=printfib(n-1);
        int fib=fibn_1 + fibn_2;
        return fib;

    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(printfib(n));
    }
    
}

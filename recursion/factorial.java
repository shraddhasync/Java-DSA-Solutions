package recursion;

public class factorial {
    public static int printfac(int n){

        if(n==0){
            return 1;
        }
        
        int factill=printfac(n-1);
        int fac=printfac(n-1) * n;
        return fac;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printfac(n));
    }
    
}

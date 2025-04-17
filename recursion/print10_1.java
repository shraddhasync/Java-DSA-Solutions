package recursion;

public class print10_1 {
    public static void printfrom1to10(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printfrom1to10((n-1));
    }
    public static void main(String[] args) {
        int n=10;
        printfrom1to10(n);
    }
    
}

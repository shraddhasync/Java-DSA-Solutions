package recursion;

public class print1_10 {
    public static void print1_10(int n){
        if(n ==1 ){
            System.out.println(n);
            return;
        }

        print1_10((n-1));
        System.out.println(n);
    }
   public static void main(String[] args) {
    int n=10;
    print1_10(n);
   }
    
}

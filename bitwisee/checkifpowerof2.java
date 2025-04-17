package bitwisee;

public class checkifpowerof2 {
    public static void main(String[] args) {
        int n=3;

        int newnum=(n & (n-1));

        if(newnum==0){
            System.out.println("it is power of 2");
        }else{
            System.out.println("not power of 2");
        }
    }
    
}
//property for above
// eg- 4 -2^2
//     (4 & (4-1) == 0) so it is power of 2

//     16 -2^4
//     (16 & (16-1)==0) so it is power of 2

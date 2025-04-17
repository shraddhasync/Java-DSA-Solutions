package recursion;

public class tilingproblem {
    public static int tiling(int n){
        //basecase
        if(n ==0 || n==1){
            return 1;
        }

        //choice
        //vertical
        int verticalways=tiling(n-1);

        //horizontal
        int horizontalways=tiling(n-2);
        int totalways=verticalways+horizontalways;
        return totalways;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(tiling(n));
    }
    
}

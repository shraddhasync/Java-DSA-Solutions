import java.util.Arrays;

public class leetcode_2373 {
    public static int[][] largestLocal(int[][] grid) {

        int n=grid.length;

        int[][] localmatrix=new int[n-2][n-2];

        for(int row=0;row<(n-2);row++){
            for(int col=0;col<(n-2);col++){

                localmatrix[row][col]=findmax(grid,row,col);
            }
        }

        return localmatrix;


    }
    public static int findmax(int[][] grid,int row,int col){

        int maxval=Integer.MIN_VALUE;

        for(int i=row;i<(row+2);i++){
            for(int j=col;j<=(col+2);j++){

                maxval=Math.max(maxval,grid[i][j]);

            }
        }
        return maxval;
    }
    public static void main(String[] args) {
        
        int[][] grid={{9,9,8,1},
                      {5,6,2,6},
                      {8,2,6,4},
                      {6,2,2,2}};

       for(int i=0;i<4;i++){

        int sum=0;
        for(int j=0;j<4;j++){
            System.out.println("ele : "+grid[i][j]);
            sum=sum+grid[i][j];
            
        }

        System.out.println(sum);
       }
    }
}

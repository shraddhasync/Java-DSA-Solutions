package twodarray;

public class diagonalsum {
    public static void printdiagonalsum(int matrix[][]){
        int sum=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){

                if(i==j){
                    sum=sum+matrix[i][j];
                }h
                if(i!=j){    //6!=6
                if(i+j==matrix.length-1){
                    sum=sum+matrix[i][j];

                }}
            }
        }
        System.out.println(sum);

        //optimize solution
        // int sum =0;

        // for(int i=0;i<matrix.length;i++){

        //     sum=sum+matrix[i][i];      //i==j 
              
        //     if(i!=matrix[i][matrix.length-1-i]){    
        //     sum=sum+matrix[i][matrix.length-1-i];          
        //     }
        // }
        // System.out.println(sum);


    
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11}};
        printdiagonalsum(matrix);
    }
    
}

package twodarray;

import rearray.sumofsubarray;

public class sumofsecondrow {
    public static void main(String[] args) {
        int matrix[][]={{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        int sum=0;

        for(int i=1;i<=1;i++){
            for(int j=0;j<matrix[0].length;j++){
                sum=sum+matrix[i][j];
                
            }
        }
        System.out.println("sum is: "+sum);                
    }
    
}

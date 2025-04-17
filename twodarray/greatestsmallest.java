package twodarray;

import java.util.Scanner;
public class greatestsmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        
        //input array
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println("enetr element "+i+" "+j);
                matrix[i][j]=sc.nextInt();

            }
        }
        //output array
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]);
            }
        }
        int max=Integer.MIN_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];

                }
            }
        }
        int min=Integer.MAX_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];

                }
            }
        }

        System.out.println("greattest elemrnt is: "+max);
        System.out.println("smallest elemnt is: "+min);

    }
    
}

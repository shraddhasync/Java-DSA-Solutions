package twodarray;
import java.util.Scanner;
public class search {
    public static boolean printkey(int matrix[][],int key){

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("element found at "+i+" "+j);
                    return true;
                    
                }
            }
        }
        System.out.println("key ot found");
        return false;
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println("enter element: "+i+" "+j);
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter key: ");
        int key=sc.nextInt();
        System.out.println(printkey(matrix,key));



    }
    
}

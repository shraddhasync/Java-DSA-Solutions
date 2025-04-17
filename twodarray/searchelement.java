package twodarray;

public class searchelement {
    public static void searching(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        int a=0;

        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("element found at : "+row+" "+col);
                a=a+1;
                break;
            }
            if(key<matrix[row][col]){
                col--;

            }else{
                row++;
                

            }

        }
        if(a==0){
            System.out.println("element not found");


        }
        
        
     }
    
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        int key=25;
        searching(matrix,key);                
    }
    
}

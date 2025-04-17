package twodarray;

public class numberofdigits {
   
    public static void main(String[] args) {
        int matrix[][]={{4,8,7},
                        {8,8,7}};
        
        int key=8;

        int a=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    a=a+1;
                    System.out.println("at index: "+i+" "+j);
                }
            }
        }
        System.out.println("no of keys: "+a);

    }
    
}

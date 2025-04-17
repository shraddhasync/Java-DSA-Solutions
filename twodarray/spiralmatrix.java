package  twodarray;
public class spiralmatrix {
    public static void printspiral(int matrix[][]){

        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){
        //top
        for(int i=startcol;i<=endcol;i++){
            System.out.print(matrix[startrow][i]+ " ");       //row=0,col++
        }
        
        //right
        for(int j=startrow+1;j<=endrow;j++){
            System.out.print(matrix[j][endcol]+ " ");         //row++,col=length-1
        }

        //bottom
        for(int k=endcol-1;k>=startcol;k--){
            if(startrow==endrow){
                break;
            }
            System.out.print(matrix[endrow][k]+ " ");         //row=endrow,col--
        }

        //left
        for(int h=endrow-1;h>=startrow+1;h--){
            if(startcol==endcol){
                break;
            }
            System.out.print(matrix[h][startcol]+ " ");       //row--,col=startcol
        }
        startcol++;
        startrow++;
        endcol--;
        endrow--;
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {12,14,15,16}};

        printspiral(matrix);                    
    }
    
}

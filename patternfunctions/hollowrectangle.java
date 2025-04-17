package patternfunctions;


public class hollowrectangle {
    public static void hollow_rectabgle(int row,int col){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==row || j==col || j==1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int row=4;
        int col=5;
        hollow_rectabgle(row,col);
    }
    
}

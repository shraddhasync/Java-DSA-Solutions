package patternfunctions;

public class hollowrombus {
    public static void hollowrombo(int row){

        for(int i=1;i<=row;i++){

            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=row;j++){
                if( i==1 || i==row || j==row || j==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=5;
        hollowrombo(row);
    }
    
}

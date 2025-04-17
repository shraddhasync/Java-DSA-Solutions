package patternfunctions;

public class floyd_triangle {
    public static void floyd(int row){


        int num=1;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+num+" ");
                num=num+1;
                
            }
            for(int j=1;j<=row-i;j++){
                System.out.print("   ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int row=5;
        floyd(row);
    }
    
}

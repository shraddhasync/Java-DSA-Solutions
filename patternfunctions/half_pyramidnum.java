package patternfunctions;

public class half_pyramidnum {
    public static void half_pyramid_nums(int row){

        for(int i=1;i<=row;i++){

            for(int j=1;j<=row-i+1;j++){
                System.out.print(j);
            }
            for(int j=i;j<=i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        int row=5;
        half_pyramid_nums(row);
    }
    
}

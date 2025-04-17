package patternfunctions;

import pattern.invertedrighttriangle;

public class half_pyramid {
    public static void innverted_half_pyramid(int row){
        //outer loop
        for(int i=1;i<=row;i++){

            for(int j=1;j<=row-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

            
        }
        

    }
    public static void main(String[] args) {
        int row=4;
        innverted_half_pyramid(row);
    }
    
}

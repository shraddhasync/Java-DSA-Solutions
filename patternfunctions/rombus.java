package patternfunctions;

public class rombus {
    public static void rombo(int row){
        for(int i=0;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int row=5;
        rombo(row);
    }
    
}

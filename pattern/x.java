package pattern;

public class x {
    public static void main(String[] args) {
        int row=5;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row*2)-1;j++){
                if(i==j || j==2*row-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        for(int i=row;i>=1;i--){
            for(int j=1;j<=(row*2)-1;j++){
                if(i==j || j==2*row-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
    
}

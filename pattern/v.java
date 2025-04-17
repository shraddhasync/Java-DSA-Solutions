package pattern;

public class v {
    public static void main(String[] args) {
        int row=5;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=2*row-1;j++){
                if(i==j  |  j==(2*row-i)){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}

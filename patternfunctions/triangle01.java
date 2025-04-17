package patternfunctions;

public class triangle01{
    public static void triangle(int row){

        int print=1;

        for(int i=1;i<=row;i++){

               if(i%2==0){
                print=0;
               }
               else{
                print=1;
               }
            for(int j=1;j<=i;j++){
                System.out.print(print);
                if(print==1){
                    print=0;

                }else{
                    print=1;
                }
            }
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int row=5;
        triangle(row);
    }
}
    
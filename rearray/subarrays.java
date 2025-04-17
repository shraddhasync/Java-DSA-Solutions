package rearray;

public class subarrays {
    public static void printsubarray(int number[]){
    int totalsubarray=0;

        for(int i=0;i<number.length;i++){
            int start =i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]);
                    

                }
                totalsubarray=totalsubarray+1;
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("total subarrays are: "+totalsubarray);

    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printsubarray(number);
    }
    
    
}

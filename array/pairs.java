package array;

public class pairs {
    public static void printpairs(int number[]){

        for(int i=0;i<number.length;i++){

            int curr=number[i];    //2
               
            for(int j=i+1;j<number.length;j++){               //4,6,8,10
                System.out.print("("+curr+","+number[j]+")");
            }

        System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printpairs(number);

    }
    
}

package rearray;

public class bruteforce {                         //due to bad time complexity of this brute force method we use prefix method to find max sum of a array
    public static void printmaxsumsubarray(int number[]){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]);
                    sum=sum+number[k];
                }
                System.out.println("  sum is:"+sum);
                if(sum>max){
                    max=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum array is: "+max);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printmaxsumsubarray(number);
    }
    
}

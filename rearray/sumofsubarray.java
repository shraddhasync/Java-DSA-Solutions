package rearray;

public class sumofsubarray {
    public static void printsumsubarray(int number[]){
        
    for(int i=0;i<number.length;i++){
        int start =i;
        for(int j=i;j<number.length;j++){
            int end=j;
            int sum=0;
            for(int k=start;k<=end;k++){
                System.out.print(number[k]);
                sum=sum+number[k];

            }
            System.out.println("     sum is:"+sum);
            System.out.println();

        }
        System.out.println();

    }

}
public static void main(String[] args) {
    int number[]={2,4,6,8,10};
    printsumsubarray(number);
}
}
    


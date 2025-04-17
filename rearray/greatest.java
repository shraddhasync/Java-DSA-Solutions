package rearray;

public class greatest {
    public static void main(String[] args) {
        
        int number[]={4,3,2,5,1};

        int max=Integer.MIN_VALUE;

        int indexy=0;

        for(int i=0;i<number.length;i++){
            if(number[i]>max){
                max=number[i];
                indexy=i;
            }
        }
        System.out.println(max+" with index "+indexy );
    }
    
}
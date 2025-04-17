package rearray;

public class greatestexmple {
    public static void main(String[] args) {
        int num[]={1,2,10,4,5};
        int max=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
            
        }
        System.out.println(max);
    }
    
}

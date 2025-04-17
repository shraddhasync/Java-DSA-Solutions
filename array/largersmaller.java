package array;

public class largersmaller {
    public static int largerone(int numbers[]){
        
        int larger=Integer.MIN_VALUE;
        int smaller=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>larger){
                larger=numbers[i];
            }
            if(numbers[i]<smaller){
                smaller=numbers[i];
                
            }
            
        }
        System.out.println("smaller no. is: "+smaller);
        return larger;

    }
    public static void main(String[] args) {
        int numbers[]={12,2,34,45,46,57,58,68,69,70,36};
        int large=largerone(numbers);

        System.out.println("larger is: "+large);
        
    }
    
}

package reloop;

public class evenodd {
    public static void main(String[] args) {
        int n=10;
        int even=0;
        int odd=0;
        
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even=even+i;
                

            }else{
                odd=odd+i;
            
            }
        }
        System.out.println(even+" & "+odd);
    }
    
}

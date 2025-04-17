package reloop;

public class checkprimeornot {
    public static void main(String[] args) {
        
        int n=6;
        int check=0;

        for(int i=2;i<=(n-1);i++){
            if(n%i==0){
                check=check+1;
            }
        }
        if(check==0){
            System.out.println("its prime");
        }else{
            System.out.println("not prime");
        }
    }
    
}

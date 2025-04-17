package bitwisee;

public class getithbit {
    public static void ith(int n,int i){

        int bitmask=1<<i;
        if((n & bitmask)==0){
            System.out.println("ith bit is 0");
        }else{
            System.out.println("ith bit is 1");
        }
    }
    public static void main(String[] args) {
        ith(10,3);
    }
    
}

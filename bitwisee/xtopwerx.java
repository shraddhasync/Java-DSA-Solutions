package bitwisee;

public class xtopwerx {
    public static void main(String[] args) {
        int a=4;
        int b=4;
        int ans=1;
        while(b>0){
            if((b & 1)!=0){   //check lsb
                ans=a*ans;
            }
            a=a*a;
            b=b>>1;

        }
        System.out.println(ans);
    }
    
}

package recursion;

public class topower {
    public static int tothepower(int n,int power){
        if(power == 0){
            return 1;
        }


        int until=tothepower(n,power-1);
        int ans=n * until;
        return ans;

    }
    public static void main(String[] args) {
        int n=2;
        int power=10;
        System.out.println(tothepower(n,power));
    }
    
}

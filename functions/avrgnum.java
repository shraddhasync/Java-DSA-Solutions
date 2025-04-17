package functions;

public class avrgnum {
    public static void avrg(int a,int b, int c){
        
        int d=a+b+c;
        int ans=d/3;

        System.out.println(ans);
    }
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        avrg(a,b,c);
    }
}
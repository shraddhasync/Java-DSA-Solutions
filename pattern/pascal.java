package pattern;

public class pascal {
    public static void main(String[] args) {
        int row=5;

        for(int i=0;i<=row-1;i++){
            for(int j=1;j<=row-i-1;j++){
                System.out.print(" ");
            }
            int temp = (int)(Math.pow(11, i));

            for(int j=1;j<=i+1;j++){
                System.out.print(temp%10+" ");

                temp /= 10;
            }
            System.out.println();
        }

    }
}
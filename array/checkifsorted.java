package array;
import java.util.Scanner;
public class checkifsorted {
    public static void main(String[] args) {

        int number[]={63,7,35,5,767};

        int check=0;

        for(int i=0;i<number.length-1;i++){
            if(number[i]>number[i+1]){
                check=check+1;
            }

        }
        if(check!=0){
            System.out.println("not sorted");
        }else{
            System.out.println("sorted");
        }
        


    }
    
}

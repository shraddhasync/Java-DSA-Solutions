package reloop;

import java.util.Scanner;
public class weekday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("enter num: ");
            int num=sc.nextInt();

            if(num<8){
                if(num==1){
                    System.out.println("monday");
                    break;
                }
                if(num==2){
                    System.out.println("tuesday");
                    break;
                }
                if(num==3){
                    System.out.println("wednesday");
                    break;
                }
                if(num==4){
                    System.out.println("thursday");
                    break;
                }
                if(num==5){
                    System.out.println("friday");
                    break;
                }
                if(num==6){
                    System.out.println("satu2day");
                    break;
                }
                if(num==7){
                    System.out.println("sunday");
                    break;
                }
                
            }else{
                System.out.println("wrong input");
            }
        }while(true);
    }
}

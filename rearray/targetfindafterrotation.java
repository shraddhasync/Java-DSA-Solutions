package rearray;

import java.util.Arrays;

public class targetfindafterrotation {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        
        int k=3;
        int key=3;
        int check=0;

        for(int j=1;j<=k;j++){
        int temp=num[0];
        num[0]=num[num.length-1];

        for(int i=num.length-2;i>=1;i--){
            num[i+1]=num[i];
        }
        num[1]=temp;
        }
        
        System.out.println(Arrays.toString(num));

        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                check=check+i;
            }
        }
        System.out.println("index of key: "+check);


        
    }
    
}

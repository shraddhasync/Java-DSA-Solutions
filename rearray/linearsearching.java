package rearray;

public class linearsearching {
    public static void main(String[] args) {
        int num1[]={1,2,3,4,5};

        int key=3;
        int check=-1;                                                                                                                       

        for(int i=0;i<=num1.length-1;i++){
            if(num1[i]==key){
                check=i;

            }
        }
        
        System.out.println(check);
        

    }
    
}

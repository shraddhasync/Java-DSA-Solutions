package rearray;

public class targetfind {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int key=8;
        int check=0;

        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                check=check+i;
            }


        }
        if(check>0){
            System.out.println(check);
        }else{
            System.out.println("-1");
        }
    }
    
}

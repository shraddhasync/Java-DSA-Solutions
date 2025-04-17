package rearray;


public class repearelement {
    public static void distinctelement(int num[]){
        int check=0;

        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                   check=check+1;
                }
            }
        }
        if(check>0){
            System.out.println("true");
        }else{}

    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        distinctelement(num);

        
    }
    
}

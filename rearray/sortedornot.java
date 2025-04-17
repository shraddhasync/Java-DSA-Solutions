package rearray;

public class sortedornot {
    public static void main(String[] args) {
        int number[]={4,5,2,1,3};

        int check=0;

        for(int i=0;i<number.length-1;i++){
            if(number[i]>number[i+1]){
                check=check+1;
            }else{

            }
        }
        if(check==0){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
        
    }
    
}

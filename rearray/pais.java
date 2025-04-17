package rearray;

public class pais {
    public static void printpairs(int num[]){                    //arithmatic progression forumula can be used directly to find total num of paairs in array=(n(n-1))/2
        int total=0;

        for(int i=0;i<num.length;i++){ 
            int curr=num[i]; //curr
            for(int j=i;j<num.length;j++){
                System.out.print("(" + curr + "," + num[j] +  ")");
                total=total+1;
            }
            System.out.println();
        }
        System.out.println("total pairs are: "+total);

    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        printpairs(num);

    }
    
}

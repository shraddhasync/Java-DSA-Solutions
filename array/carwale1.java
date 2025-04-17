package carwale;
import java.util.ArrayList;
import java.util.List;

public class carwale1 {
    public static void main(String[] args) {

        int[] a={3,2,1};
        int k=1;

        List<ArrayList<Integer>> arr=new ArrayList<>();
        

        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length;j++){
                
                ArrayList<Integer> arry=new ArrayList<>();

                if(i != j){
                    int c=(Math.abs(a[i]))-(Math.abs(a[j]));

                    if( c == k){
                        arry.add(a[i]);
                        arry.add(a[j]);
                        arr.add(arry);
                        
                    }
                }

            }

        }
        System.out.println(arr);
        

    }
    
}

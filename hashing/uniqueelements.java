package hashing;
import java.util.HashSet;


public class uniqueelements {
    public static void main(String[] args) {
        int arr[]={1,2,7,9,4,3,4,5,3,2};

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);

    }
    
}

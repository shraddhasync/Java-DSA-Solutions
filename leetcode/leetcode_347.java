import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class leetcode_347 {
    public static int[] topKFrequent(int[] nums, int k) {

       
        HashSet<Integer> set = new HashSet<>(); // set 
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                int oldf=map.get(nums[i]);
                int newf=oldf+1;
                map.put(nums[i],newf);
            }else{
                map.put(nums[i],1);
            }

            set.add(nums[i]);
        }

        

        Integer[] arr = set.toArray(new Integer[set.size()]); // set wala array

        // map ke according sort karenge arr 

        
            for(int j=0;j<nums.length;j++){
                for(int i=0;i<arr.length-1;i++){
                    int freq=map.get(arr[i]);
                    int freq2=map.get(arr[i+1]);

                    if(freq > freq2){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;

                    }
                    
    
                    
                }
            }
            

            for(int j=0;j<arr.length;j++){
                for(int i=0;i<arr.length-1;i++){
                    if(arr[i] >arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                }
            }
            
        

            int[] ans=new int[k];

            for (int i = 0; i < k; i++) {
                ans[i] = arr[i];
            }
    
            return  ans;


    
        
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    
}

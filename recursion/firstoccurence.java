package recursion;

public class firstoccurence {
    public static int firstcome(int[] arr,int key,int i){
        if(i == arr.length-1){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }
        return firstcome(arr,key,(i+1));

    }
    public static void main(String[] args) {
        
        int[] arr={2,3,4,6,7,8};
        int key=5;
        
        System.out.println(firstcome(arr,key,0));
    }
    
}

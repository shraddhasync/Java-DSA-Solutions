package array;

public class binarysearch {
    public static int binary(int number[],int key){

        int start=0;
        int end=number.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(key==number[mid]){
                return mid;
            }
            if(key>number[mid]){
                start=mid+1;
            }
            if(key<number[mid]){
                end=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={12,23,34,45,56,67,78,89,90};
        int key=1;
        int ans=binary(number,key);

        System.out.println("index of key is: "+ans);

    }
}
    
import java.util.Arrays;

public class leetcode_2864 {
    public static String maximumOddBinaryNumber(String s) {

        int[] arr=new int[s.length()];

        
       

        for(int i=0;i<s.length();i++){
            arr[i]=Integer.valueOf(String.valueOf(s.charAt(i)));
        }
    
        int l=0;
        int r=arr.length-1;
       
        while(l < r){

            if(arr[l]==1 && arr[r]==0){
                l++;
                r--;
            }
            else if(arr[l]==0 && arr[r]==1){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            else if(arr[l]==1){
                l++;
            }
            else if(arr[r]==0){
                r--;
            }
        }
        
    
        for(int i=arr.length-1;i>=0;i--){
           
            if(arr[i]==1){
                int temp=arr[i];

                arr[i]=arr[arr.length-1];
               
                arr[arr.length-1]=temp;
               
                break;
            }
            
        }


        String s1="";
        for(int i=0;i<arr.length;i++){
            s1 = s1.concat(String.valueOf(arr[i]));
        }
        return s1;


        
    }
    public static void main(String[] args) {
        String s="10";
        System.out.println(maximumOddBinaryNumber(s));
    }
    
}

package twopointer;

import java.util.Arrays;

public class maxwater {
    public static int maxArea(int[] height) {

        
       int i=0;
       int j=height.length-1;
       int maxwater=Integer.MIN_VALUE;

       while(i<j){

        if(height[i]<height[j]){
            int area=height[i]*(j-i);

            if(area > maxwater){
                maxwater=area;
            }
            i++;
            

        }else{
            int area=height[j]*(j-i);

            if(area > maxwater){
                maxwater=area;
            }
            j--;

        }
        

        
       
       }
       return maxwater;

       



    }
    public static void main(String[] args) {
        int height[]={2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
        
    }
    
}

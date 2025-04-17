package twopointer;

import java.util.Arrays;

public class trappingwater {
    public static void trap(int[] height) {

        
        
        int[] leftmax=new int[height.length];
        leftmax[0]=height[0];
        int lmax=0;

        for(int i=1;i<height.length;i++){

            if(height[i] > lmax){
                lmax=height[i];

            }
            leftmax[i]=lmax;
            

        }
        System.out.println(Arrays.toString(leftmax));



        int[] rightmax=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        int rmax=0;

        for(int i=height.length-2;i>=0;i--){

            if(height[i] > rmax){
                rmax=height[i];

            }
            rightmax[i]=rmax;
            

        }
        System.out.println(Arrays.toString(rightmax));

        int[] arr=new int[height.length];

        for(int i=0;i<height.length;i++){

            int minn=Integer.min(leftmax[i], rightmax[i]);
            int water=minn-height[i];
            arr[i]=water;


        }
        System.out.println(Arrays.toString(arr));

        




       
        
    }
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        trap(height);
    }
    
}

package rearray;

import java.util.Arrays;

public class trappedwaterr {
    public static int trappedarea(int height[]){

        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        System.out.println(Arrays.toString(leftmax));
        
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);

        }
        System.out.println(Arrays.toString(rightmax));

        int trappedwater=0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(rightmax[i],leftmax[i]);
            trappedwater=trappedwater+(waterlevel-height[i]);
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        System.out.println(trappedarea(height));

    }
    
}

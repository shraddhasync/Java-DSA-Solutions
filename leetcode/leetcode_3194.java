import java.util.Arrays;

class leetcode_3194 {
    public static double minimumAverage(int[] nums) {


        //sort
        for(int j=0;j<nums.length;j++){
            for(int i=0;i<nums.length-1;i++){

                if(nums[i] > nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
        


        double[] ans=new double[nums.length/2];

        int j=nums.length-1;

        for(int i=0;i<nums.length/2;i++){
                
                double avrg=((double)(nums[i] + nums[j])/2);
                ans[i]=avrg;
                j--;

            
        }

        double min=Integer.MAX_VALUE;

        for(int i=0;i<ans.length;i++){

            if(ans[i] < min){
                min=ans[i];
            }
        }
        return min;
        
    }
    public static void main(String[] args) {
        int[] nums={7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }
    
    
}

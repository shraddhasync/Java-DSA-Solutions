import java.util.Arrays;
import java.util.Stack;

public class maxareahistogram {
    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3};

        //smaller right
        Stack<Integer> sright=new Stack<>();
        int[] right=new int[heights.length];

        for(int i=heights.length-1;i>=0;i--){
            while(!sright.isEmpty() && heights[sright.peek()] >= heights[i]){
                sright.pop();
            }
            if(sright.isEmpty()){
                right[i]=heights.length; 
            }else{
                right[i]=sright.peek();
            }
            sright.push(i);
        }
        System.out.println(Arrays.toString(right));
        

        //smaller left
        Stack<Integer> sleft=new Stack<>();

        int[] left=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!sleft.isEmpty() && heights[sleft.peek()] >= heights[i]){
                sleft.pop();
            }
            if(sleft.isEmpty()){
                left[i]=-1;
            }else{
                left[i]=sleft.peek();
            }
            sleft.push(i);
        }
        System.out.println(Arrays.toString(left));

        //area
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=right[i]-left[i]-1;
            int currarea=height*width;
            if(currarea > max){
                max=currarea;
            }

        }
        System.out.println(max);





    }
}
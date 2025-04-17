package stackquestions;

import java.util.Stack;

public class removeconsecutivesubsequence{
    public static void removing(int[] arr){

        Stack<Integer> s=new Stack<>();

        for(int i=0;i<arr.length;i++){
            int curr=arr[i];

            if(s.size()==0){
                s.push(curr);
            }

            else if(s.peek() == curr){
                if(curr == arr[i+1]){

                }else{
                    s.pop();
                }

            }else{
                s.push(curr);
            }
        
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        removing(arr);
    }
    
}

    


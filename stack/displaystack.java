import java.util.Stack;

public class displaystack {
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        //using another stack
        // Stack <Integer> s2=new Stack<>();

        // while(!s.isEmpty()){
        //     s2.push(s.pop());
        // }

        // while(!s2.isEmpty()){
        //     System.out.println(s2.peek());
        //     s.push(s2.pop());
        // }

        

        //using array
        int n=s.size();
        int[] arr=new int[n];

        for(int i=arr.length-1;i>=0;i--){
            arr[i]=s.pop();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            s.push(arr[i]);
        }


    }
    
}

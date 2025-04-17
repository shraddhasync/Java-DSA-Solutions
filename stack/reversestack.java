

import java.util.*;

public class reversestack {
    static class stack{
        public static void pushbottom(Stack<Integer> s,int data){

            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top=s.pop();
            pushbottom(s, data);
            s.push(top);
        }
        public static void reversing(Stack<Integer> s){
            if(s.isEmpty()){
                return;
            }

            int top=s.pop();
            reversing(s);
            pushbottom(s,top);

        }
        public static void printstack(Stack<Integer> s){
            while(!s.isEmpty()){
                System.out.println(s.pop());
            }
        }
        public static void main(String[] args) {
            Stack<Integer> s=new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);

            reversing(s);
            printstack(s);
           

           
        }
    }
    
}

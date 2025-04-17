import java.util.Stack;

public class insertatanyindex {
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);

        int index=3;
        int ele=57762;

        Stack <Integer> s2=new Stack<>();

        while(s.size() > index){
            s2.push(s.pop());
        }
       
        s.push(ele);

        while(s2.size() > 0){
            s.push(s2.pop());
        }

        System.out.println(s);
    }
    
}

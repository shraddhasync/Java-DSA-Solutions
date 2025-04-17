import java.util.Stack;

public class removefrombottom {
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);

        Stack <Integer> s2=new Stack<>();

        int index=3;


        while(s.size() > index+1){
            s2.push(s.pop());
        }
        s.pop();


        while(s2.size() > 0){
            s.push(s2.pop());
        }

        System.out.println(s);
    }
    
}

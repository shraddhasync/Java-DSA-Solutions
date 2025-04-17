import java.util.Stack;

public class maxnexted {
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        
        int size = 0;
        int max=0;

        for(char a : s.toCharArray()){
            if(a=='(')size++;
            if(a==')')size--;
            max = Math.max(max,size);
        }
        System.out.println(max);
    }
    
}

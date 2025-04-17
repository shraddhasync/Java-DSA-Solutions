import java.util.Stack;

public class ifpallinddrome {
    public static boolean checkif(String a){
        Stack <Character> s=new Stack<>();

        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            s.push(ch);
        }

        String b="";
        while(!s.isEmpty()){
            char top=s.peek();
            b=b.concat(String.valueOf(top));
            s.pop();
        }
        
        if(a.length() == b.length()){
            if(a.equals(b)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String a="abcba";
        System.out.println(checkif(a));
    }
    
}

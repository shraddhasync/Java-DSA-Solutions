package stackquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class directories {
    public static void main(String[] args) {
        String a="/home/user/Documents/././././";
        ArrayList<String> list=new ArrayList<>();


        String b="";
        for(int i=1;i<a.length();i++){
        
            if(a.charAt(i) != '/'){
                b=b.concat(String.valueOf(a.charAt(i)));
            }else{
                b=b.concat(String.valueOf('/'));
                list.add(b);
                b="";
                
            }
            
          
        }

        String[] arr=list.toArray(new String[list.size()]);

        String c=arr[0];
        String d="/";
        d=d.concat(c);
        arr[0]=d;




        Stack<String> s=new Stack<>();
        
        
        for(int i=0;i<arr.length;i++){
            String z=arr[i];

            if(!(z.equals("./")) && !(z.equals("../"))){
                s.push(z);
            }
            else if(z.equals("../")){
                s.pop();
            }
            

        }
        
        Stack<String> y=new Stack<>();
        while(!s.isEmpty()){
            y.push(s.pop());
        }
        

        String ans="";
        while(!y.isEmpty()){
            ans=ans.concat(y.pop());
        }
        System.out.println(ans);
        
        

        
       
    }
    
}

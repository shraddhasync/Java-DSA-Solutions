package stackquestions;

import java.util.Stack;

public class decode {
    public static void main(String[] args) {
        String a="2[a3[b]c]";

        Stack<Character> ch=new Stack<>();
        Stack<Integer> num=new Stack<>();

        int countnum=0;
        StringBuilder b=new StringBuilder();

        for(int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
         

            if(a.charAt(i) >= 48 && a.charAt(i) <= 57){
                num.push(Integer.parseInt(String.valueOf(a.charAt(i))));
          
            }else if(a.charAt(i) == ']'){
                if(countnum==0){
                    int count=0;
                    char popp=ch.pop();
                    int top=num.pop();
                    while(count < top){
                      
                        b=b.append(popp);
                        count++;
                        System.out.println("b : "+b);
                    }
                    ch.pop();
                    countnum++;

                    System.out.println("ch :" +ch);
                    System.out.println("num : "+num);
                    System.out.println("countnum :"+countnum);
                }else{
                    System.out.println("b :"+b);
                    b=b.insert(0,ch.pop());
                    System.out.println("b :"+b);
                  
                    StringBuilder c=new StringBuilder(b);
                
                    int top=num.pop();
                    int count=0;
                    while(count+1 < top){
                        b.append(c);
                        count++;
                        System.out.println(" b : "+b);
                       
                    }
                   
                    ch.pop();
                    countnum++;
                }
            }
            else{
                ch.push(a.charAt(i));
            }
        }
        System.out.println(ch);
        System.out.println(num);

        
        if(!ch.isEmpty()){
            Stack<Character> one = new Stack<>();
            
            while(!(ch.size()==0)){
            one.push(ch.pop());
            }

            System.out.println("onne :"+one);

           
            while(!one.isEmpty()){
            b.append(one.pop());
        }
  
        }
        System.out.println("ans : "+b);

        
        

    }
    
}

import java.util.Stack;

public class leetcode_1700 {
    public static void countStudents(int[] students, int[] sandwiches) {

        Stack<Integer> stackstudents=new Stack<>();
        Stack<Integer> stacksandwiches=new Stack<>();

        for(int i=0;i<students.length;i++){
            stackstudents.push(students[i]);
        }
       
        Stack<Integer> stackstudents1=new Stack<>();

        while(!stackstudents.isEmpty()){
            int top=stackstudents.pop();
            stackstudents1.push(top);
        }
       



        for(int i=0;i<sandwiches.length;i++){
            stacksandwiches.push(sandwiches[i]);
        }
       
        Stack<Integer> stacksandwiches1=new Stack<>();

        while(!stacksandwiches.isEmpty()){
            int top=stacksandwiches.pop();
            stacksandwiches1.push(top);
        }

        System.out.println(stackstudents1);
        System.out.println(stacksandwiches1);


        while (!stackstudents1.isEmpty() && !stacksandwiches1.isEmpty()) {

            if(stackstudents1.peek() == stacksandwiches1.peek()){
                stackstudents1.pop();
                stacksandwiches1.pop();
            }else{

                int top=stackstudents1.pop();
                Stack<Integer> s=new Stack<>();

                while(!stackstudents1.isEmpty()){
                    s.push(stackstudents1.pop());
                }
               
              
                stackstudents1.push(top);
                
                while(!s.isEmpty()){
                    stackstudents1.push(s.pop());
                }
              
                
            }

            
        }
        System.out.println(stackstudents1.size());
        
    
       


        
    }
    public static void main(String[] args) {
        int[] students={1,1,1,0,0,1};
        int[] sandwiches={1,0,0,0,1,1};
        countStudents(students, sandwiches);
    }
    
}

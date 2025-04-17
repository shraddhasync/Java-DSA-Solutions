import java.util.Stack;

public class leetcode_1700again {
    public static int countStudents(int[] students, int[] sandwiches) {

        Stack<Integer> stackstudent=new Stack<>();
        for(int i=students.length-1;i>=0;i--){
            stackstudent.push(students[i]);
        }
        Stack<Integer> stacksandwich=new Stack<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            stacksandwich.push(sandwiches[i]);
        }
        
        int count=0;

        while(!stackstudent.isEmpty() && count<students.length){
        
            if(stackstudent.peek() == stacksandwich.peek()){
                stackstudent.pop();
                stacksandwich.pop();
                count=0;
                
            }
            else{
                stackstudent=change(stackstudent);
                count++;
                
            }
           
        }
        return stackstudent.size();
    }
    public static Stack<Integer> change(Stack<Integer> stackstudent){

        Stack<Integer> snew=new Stack<>();
        Stack<Integer> ssnew=new Stack<>();

        snew.push(stackstudent.pop());
        while(!(stackstudent.isEmpty())){
            ssnew.push(stackstudent.pop());
        }
        while(!(ssnew.isEmpty())){
            snew.push(ssnew.pop());
        }
        return snew;

    }
    public static void main(String[] args) {
        int[] students={1,1,1,0,0,1};
        int[] sandwiches={1,0,0,0,1,1};
        System.out.println(countStudents(students,sandwiches));
    }
    
}

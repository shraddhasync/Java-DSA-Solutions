import java.util.ArrayList;
import java.util.Stack;
public class dailytemp{
    public static void dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();

        ArrayList res=new ArrayList<>();

        for(int i=0;i<temperatures.length;i++){
            int a=temperatures[i];

            if(s.isEmpty()){
                s.push(a);
            }
            else{
                if(s.peek() < a){
                    int sizing=s.size();
                    res.add(sizing);
                    s.pop();
                    s.push(a);
                }else{
                    s.push(a);
                }
            }
        }

        System.out.println(res);
    }
    public static void main(String[] args) {
        int[] temperatures={73,74,75,71,69,72,76,73};
        dailyTemperatures(temperatures);
        
    }
}
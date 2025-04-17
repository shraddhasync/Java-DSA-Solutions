package hashing;
import java.util.ArrayList;
public class maxandmin {
    public static void main(String[] args) {
        ArrayList <Double> list=new ArrayList<>();

        list.add(3.14);
        list.add(2.71);
        list.add(1.618);
        list.add(0.577);

        double max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            double a=list.get(i);
            if(a>max){
                max=a;
            }
            
        }
        double min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            double a=list.get(i);
            if(a<min){
                min=a;
            }
            
        }
        System.out.println(max);
        System.out.println(min);

    }
    
}

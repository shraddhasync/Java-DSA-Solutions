package bitwisee;

public class add1 {
    public static void main(String[] args) {
        int n=5;
        int newn=-(~n);
        System.out.println(newn);

    }
    
}
//adding 1 to a number
//eg- 5 -> 6
//first '~' the given number(this wil give us 2's complement of num)
//then put(-) (this means we added 1)


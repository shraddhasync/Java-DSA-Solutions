package strinngs;

public class printletters {
    public static void printletter(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        String name="shraddha";
        printletter(name);
    }
    
}

package strinngs;

public class toggle {
    public static String printing(String str){
        
        char[] arry=str.toCharArray();

        for(int i=0;i<arry.length;i++){
            if(Character.isUpperCase(arry[i])){
               arry[i]=Character.toLowerCase(arry[i]);
               System.out.println(arry[i]);
            }
            else{
             arry[i]=Character.toUpperCase(arry[i]);
             System.out.println(arry[i]);
            }
 
         }
         return arry.toString();
         

    }
    public static void main(String[] args) {
        
        String str="aPLe";
        System.out.println(printing(str));

        

    }
    
}

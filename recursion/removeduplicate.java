package recursion;

public class removeduplicate {
    public static String noduplicate(String str,StringBuilder ans ,int i,boolean[] arr){

        
        

        //basecase
        if(i == str.length()){
            System.out.println(ans);
            return "";
            
        }

        //kaam
        char currchar=str.charAt(i);
        if(arr[currchar - 'a'] == true){
            noduplicate(str,ans,i+1,arr);
        }
        else{
            arr[currchar - 'a'] = true;
            
            noduplicate(str,ans.append(currchar), i+1,arr);

        }
    
    }

    public static void main(String[] args) {
        String str="appnnacollege";
        int i=0;
        System.out.println(noduplicate( str,new StringBuilder(" "),i,new boolean[26] ));
    }
    
}

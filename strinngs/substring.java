package strinngs;

public class substring {
    public static String printsubstring(String name,int si,int ei){

        String subname="";

        for(int i=si;i<ei;i++){
            subname=subname+name.charAt(i);
        }
        return subname;
        
    }
    public static void main(String[] args) {
        String name="helloworld";
        int si=0;
        int ei=5;
        System.out.println(printsubstring(name, si, ei));
        //or
        System.out.println(name.substring(0,5));    //"name of string".substring(starting index,ending index)

    }
    
}

package strinngs;

public class compressstring {
    public static String compressing(String name){
        String newstr="";

        for(int i=0;i<name.length();i++){
            Integer count=1;                               //count should be a class,not object so we can convert it to string later
            while(i<name.length()-1 && name.charAt(i)==name.charAt(i+1)){
            count=count+1;
            i++;
            }
            newstr=newstr+name.charAt(i);
            if(count>1){
                newstr=newstr+count.toString();        //.tostring is used to convert any datastructure (which is a class not object,eg int is                                        object,Integer is class) to string 
            }

        }
        return newstr;

    }
    public static void main(String[] args) {
        String name="aaabbcccdddd";
        System.out.println(compressing(name));
    }
    
}

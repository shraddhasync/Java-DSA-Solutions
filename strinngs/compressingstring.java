package strinngs;

public class compressingstring {
    public static String printing(String name){

        StringBuilder newstring=new StringBuilder();

        for(int i=0;i<name.length();i++){
            Integer count=1;
            while(i<name.length()-1 && name.charAt(i)==name.charAt(i+1) ){
                count++;
                i++;

            }
            newstring.append(name.charAt(i));
            if(count>1){
                newstring.append(count.toString());
            }
        }
        return newstring.toString();

    }
    public static void main(String[] args) {
        String name="aabbbdddcctt";
        System.out.println(printing(name));
    }
    
}

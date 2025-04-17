package strinngs;

public class changetouppercase {
    public static String intouppercase(String str){

        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));
      

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
               i++;
               sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();           //we can convert any data structure to string using   .toString()

    }
    public static void main(String[] args) {
        String str="hi, i am shraddha";
        System.out.println(intouppercase(str));
    }
    
}

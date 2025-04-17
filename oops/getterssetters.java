package oops;

public class getterssetters {
    public static void main(String[] args) {
        bank b1=new bank();
        String name="shraddha";
        b1.setpassword("dghdsd");
        System.out.println(b1.getpassword());
    }
}
class bank{
    String name;
    private String password;

    //setter
    public void setpassword(String pass){
        this.password=pass;

    }
    //getter
    public String getpassword(){
        return this.password;
    }

    

}
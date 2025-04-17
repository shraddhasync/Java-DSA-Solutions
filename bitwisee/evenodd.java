package bitwisee;

public  class evenodd{
    public static void evenorodd(int n){
                                          //jis bhi position ki actual bit malum krni hai waha &1 karo ,taki actual bit mil jay ,like here we needed lsb
        int bitmask=1;       

        if((n & bitmask)==0){
            System.out.println("even");

        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        evenorodd(3);
        evenorodd(5);
        evenorodd(10);
        
        
    }

}
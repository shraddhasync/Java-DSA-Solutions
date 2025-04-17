package rearray;

public class sellandbuy {
    public static int findmaxprofit(int price[]){

        int buyprice=Integer.MAX_VALUE;
        int maxprofit=Integer.MIN_VALUE;

        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit=price[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }else{
                buyprice=price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
       System.out.println( findmaxprofit(price));
    }
    
}

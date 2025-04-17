package rearray;

public class sellbuy {
    public static int printmaxprofit(int price[]){

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
        int price[]={6,4,8,1,7,6,3,9};
        System.out.println(printmaxprofit(price));
    }
    
}

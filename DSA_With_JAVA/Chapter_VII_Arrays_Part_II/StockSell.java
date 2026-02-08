public class StockSell{
     
    public static void BuyAndSell(int Price[]){
        int buyStockPrice=Integer.MAX_VALUE;
        int profit;
      int maxProfit=0;
        for(int i=0;i<Price.length;i++){
       
            if (buyStockPrice<Price[i]){
                profit=Price[i]-buyStockPrice;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyStockPrice=Price[i];
            }
        }
        System.out.println("Profit "+maxProfit);
    }
    public static void main(String[] args) {
        int Price[]={7,1,5,3,6,4};
        BuyAndSell(Price);
    }
}
public class Stock {
    public static void buysellStock(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            buyPrice=Math.min(buyPrice,prices[i]);
            profit=Math.max(profit,prices[i]-buyPrice);
        }
        System.out.println("Profit is: "+profit);
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        buysellStock(prices);
    }
    
}

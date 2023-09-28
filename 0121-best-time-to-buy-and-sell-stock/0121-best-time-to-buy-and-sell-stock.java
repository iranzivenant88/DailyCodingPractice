class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length < 2 || prices == null){
            return maxProfit;
        }    
        int buyingTime = 0;
        int sellingTime = 1;
        
        while(sellingTime < prices.length ){
      
            if(prices[buyingTime] >= prices[sellingTime]){
                buyingTime  = sellingTime;
                sellingTime++;
            // }else if(prices[buyingTime] < prices[sellingTime]){
            //       buyingTime = sellingTime;

            }else{
                int currentProfit = prices[sellingTime] - prices[buyingTime];
                maxProfit = Math.max(maxProfit,currentProfit);
                sellingTime++;          
            }
        }
    return maxProfit;
        
    }
}
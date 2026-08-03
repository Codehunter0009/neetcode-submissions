class Solution {
    public int maxProfit(int[] prices) {
        // int max=0;
        // int profit=0;
        // int buy=0;
        // for(int i=0;i<prices.length;i++){
        //    for(int j=i+1;j<prices.length;j++){
        //     if(prices[i]>prices[i+1]){
        //         i++;
        //     }
        //     profit=prices[j]-prices[i];
        //     max=Math.max(profit,max);
        //    }
        // }
        // return max;

        //two pointer approach
    // int l=0,r=1,maxP=0;
    // while(r<prices.length){
    //     if(prices[l]<prices[r]){
    //         int profit=prices[r]-prices[l];
    //         maxP=Math.max(maxP,profit);

    //     }
    //     else{
    //         l=r;
    //     }
    //     r++;
    // }
   
    // return maxP;
//using dp

 int maxP = 0;
        int minBuy = prices[0];

        for (int sell : prices) {
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;











    }
}

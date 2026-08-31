class Solution {
    public int maxProfit(int[] arr) {
        int minPrice=arr[0],
        maxProfit=0,
        profit=0;
        for(int i=0;i<arr.length;i++){
            if(minPrice>arr[i]){
                minPrice=arr[i];
            }
            profit=arr[i]-minPrice;
            if(maxProfit<profit){
                maxProfit=profit;
            }
        }
        return maxProfit;

    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        if(nums.length==1) return nums[0];
        double max=-Double.MAX_VALUE;
        double sum=0;
        int i=0;
        while(i<k){
            sum=sum+nums[i];
            i++;
        }
        if(sum>max) max=sum;
        while(i<nums.length){
            sum+=nums[i];
            sum-=nums[i-k];
            if(sum>max) max=sum;
            i++;
        }
        return max/k;
        
    }
}
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0,
        sum=0,
        avg=0,
        count=0;
        while(i<k){
            sum+=arr[i];
            i++;
        }
        avg=sum/k;
        if(avg>=threshold){
            count++;
        }
        while(i<arr.length){
            sum+=arr[i];
            sum-=arr[i-k];
            avg=sum/k;
            if(avg>=threshold){
            count++;
        }
        i++;
        }
        return count;
    }
}
class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            // int temp=nums[i];
            arr[i]=nums[nums[i]];
            // nums[nums[i]]=temp;
        }
        return arr;
        
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
          Set<Integer> set=new HashSet<>();
        for(int i=0;i<Math.min(k,nums.length);i++){
           
             if(set.contains(nums[i])){
                    return true;
                }
                set.add(nums[i]);
            }
          
        

        for(int j=k;j<nums.length;j++){
           
             if(set.contains(nums[j])){
                    return true;
                }
                set.add(nums[j]);
                set.remove(nums[j-k]);

            }
          
        
        
        return false;
    }

}
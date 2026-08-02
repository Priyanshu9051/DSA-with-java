class Solution {
    public int findDuplicate(int[] nums) {
        // for(int i =0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[j];
        //         }
        //     }
        // }
        // return -1;
        int s=0,
        f=0;
        do{
            s=nums[s];
            f=nums[nums[f]];
            if(s==f){
                break;
            }
        }while(s!=f);
        int n1=0;
        int n2=s;
        while(n1!=n2){
            n1=nums[n1];
            n2=nums[n2];
        }
        return n1;
    }
}
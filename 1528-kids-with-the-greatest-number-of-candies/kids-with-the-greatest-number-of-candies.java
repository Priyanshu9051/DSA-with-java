class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>largest) largest=candies[i];
        }
        List<Boolean> l=new ArrayList<>();
        for(int j=0;j<candies.length;j++){
            int sum=candies[j]+extraCandies;
            if(sum>=largest){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;

        
    }
}
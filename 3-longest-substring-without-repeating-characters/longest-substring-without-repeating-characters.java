class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0,
        j=0,
        count=0,
        maxCount=0;
        while(j<s.length()){
            while(set.contains(s.charAt(j))){
                
                    set.remove(s.charAt(i));
                    count=count-1;
            i++;
            }
          
            
            

            set.add(s.charAt(j));
                count=count+1;
                j++;
            
            if(count>maxCount) maxCount= count;

        }
        return maxCount;
        
    }
}
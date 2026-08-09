class Solution {
    public int check(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return 1;
        return 0;
    }
    public int maxVowels(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int count=0,
        i=0,
        maxCount=0;
        while(i<k){
            char ch=s.charAt(i);
            sb.append(ch);
            count+=check(ch);
            i++;
        }
        if(count>maxCount) maxCount=count;
        
        int j=0;
        while(i<s.length()){
            char ch=s.charAt(i);
             char ch1=s.charAt(i-k);
             count-=check(ch1);
            
            count+=check(ch);
           

             if(count>maxCount) maxCount=count;
             i++;
             j++;
            


        }
        return  maxCount;
        
    }
}
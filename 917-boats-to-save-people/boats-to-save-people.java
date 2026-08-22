class Solution {
    public int numRescueBoats(int[] p, int l) {
        Arrays.sort(p);
        int i =0;
        int j=p.length-1;
        int count=0;
        while(i<=j){
            if(i==j){
                count++;
                break;
            }
            else if(p[i]==l){
                count++;
                i++;
            }
            else if(p[j]==l){
                count++;
                j--;
            }
            else if(p[i]+p[j]<=l){
                count++;
                i++;
                j--;
            }
            else{
                count++;
                j--;
            }
           
        }
        return count;
        
    }
}
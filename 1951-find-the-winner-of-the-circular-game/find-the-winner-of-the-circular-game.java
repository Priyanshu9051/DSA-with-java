class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int z=1;z<=n;z++){
            q.add(z);
        }
        for(int i=n;i!=1;i--){
            for(int j=1;j<k;j++){
                q.add(q.remove());
            }
            q.remove();
        }
        int ans=q.peek();
        return ans;
    }
}
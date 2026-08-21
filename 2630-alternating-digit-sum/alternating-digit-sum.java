class Solution {
    public int alternateDigitSum(int n) {
        Stack<Integer> st=new Stack<>();
        int sum=0;
        int c=0;
        while(n!=0){
            int r=n%10;
            st.add(r);
            n=n/10;
        }
        while(!st.isEmpty()){
            if(c==0){
                sum+=st.pop();
                c++;
            }
            else{
                sum-=st.pop();
                c--;
            }
        }
        return sum;
        
    }
}
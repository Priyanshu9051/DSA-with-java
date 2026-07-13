class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<op.length;i++){
            String s=op[i];
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("+")){
                int a=st.pop();
                int b=st.pop();
                int add=a+b;
                st.push(b);
                st.push(a);
                st.push(add);
            }
            else if(s.equals("D")){
                st.push(2*st.peek());
            }
            else {
               
                st.push(Integer.parseInt(s));
            }

        }
        int sum=0;
        while(st.size()>0){
            sum=sum+st.pop();
        }
        return sum;
    }
}
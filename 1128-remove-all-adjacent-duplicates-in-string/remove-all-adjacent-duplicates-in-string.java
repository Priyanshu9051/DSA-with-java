class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            
            if(st.isEmpty()){
                st.push(ch);

            }
            else if(st.peek()!=ch){
                st.push(ch);
            }
            else{
                st.pop();

            }
        }
        Stack<Character> st2=new Stack<>();
        while(st.size()!=0){
            st2.push(st.pop());
        }
        
       
        StringBuilder sb=new StringBuilder();
        while(st2.size()!=0){
            
            
            sb.append(st2.pop());
        
        }
        return sb.toString();
    }
}
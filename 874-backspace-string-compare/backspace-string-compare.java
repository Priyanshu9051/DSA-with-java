class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=0;
        Stack<Character> st=new Stack<>();
        while(i<s.length()){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
                
            }
            else if(!st.isEmpty()){
                st.pop();
            
            }
            i++;

            
        }
        int j=0;
        Stack<Character> st1=new Stack<>();
        while(j<t.length()){
            if(t.charAt(j)!='#'){
                st1.push(t.charAt(j));
                
            }
            else if(!st1.isEmpty()){
                st1.pop();
            
            }
            j++;

            
        }
        if(st.size()==0&&st1.size()==0){
            return true;
        }
        if(st.size()!=st1.size()){
            return false;
        }
        while(!st.isEmpty()){
            if( st.pop()!=st1.pop()){
                return false;
            }
           
            

        }
       return true;


    }
}
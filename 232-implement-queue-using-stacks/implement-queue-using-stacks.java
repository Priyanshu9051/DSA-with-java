class MyQueue {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> st1=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1){
            st1.push(st.pop());
        }
        int popEle= st.pop();
       while(st1.size()>0){
         st.push(st1.pop());
       }
       return popEle;

        
    }
    
    public int peek() {
          while(st.size()>1){
            st1.push(st.pop());
        }
        int p= st.peek();

       while(st1.size()>0){
         st.push(st1.pop());
       }
       return p;

        
    }
    
    public boolean empty() {
        if(st.size()==0){
            return true;
        }
        else{
        return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
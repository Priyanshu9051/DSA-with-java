class Solution {
    public String reverseWords(String s) {
        // int i=1,
        // j=s.length();
        // String ans;
        // String[] ch;
        // for(int k=1;k<=s.length();k++){
        //     ch[k]=s.charAt[k];
        // }
        // while(i<j){
        // ans[i]=s.charAt(j);
        // ans[j]=s.charAt(i);
        // i=i+1;
        // j=j-1;
        // }
        // return ans;

    //     String[] st=s.split(" ");
    //        int i=0,
    //     j=st.length-1;
    //         while(i<j){
    //     String temp=st[i];
    //     st[i]=st[j];
    //     st[j]=temp;
    //     i=i+1;
    //     j=j-1;
    //     }

    // StringBuilder sb=new StringBuilder();
    // int z=0;
    // while(z<st.length){
    //     sb.append(st[z]);
    //     z++;
    // }
    // String ans=sb.toString();
    // return ans;
    StringBuilder sb=new StringBuilder(s);
    sb.reverse();
     String st=sb.toString();
    String[] st1= st.split("\\s+");
    
             int i=0,
        j=st1.length-1;
            while(i<j){
        String temp=st1[i];
        st1[i]=st1[j];
        st1[j]=temp;
        i=i+1;
        j=j-1;
        }
      
    return String.join(" ",st1);
// return st;


        
    }
}
class Solution {
    public String reverseWords(String s) {
        String t=s.trim();
        String[] sp=t.split("\\s+");
        int i=0,
        j=sp.length-1;
        while(i<j){
            String temp=sp[i];
            sp[i]=sp[j];
            sp[j]=temp;
            i=i+1;
            j=j-1;
        }
       
        return String.join(" ",sp);


        
    }
}
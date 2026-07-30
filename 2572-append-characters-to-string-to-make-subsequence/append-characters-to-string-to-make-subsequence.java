class Solution {
    public int appendCharacters(String s, String t) {
        int i =0,
        j=0;
      
        while(i<s.length()&&j<t.length()){
            char ch1=s.charAt(i);
            char ch2=t.charAt(j);
            if(ch1==ch2) {
               
                j=j+1;
            }
            i=i+1;

        }
      
        return t.length()-j;
        
    }
}
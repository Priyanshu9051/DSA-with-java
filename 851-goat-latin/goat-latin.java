class Solution {
    public String toGoatLatin(String s) {
        String[] ans=s.split(" ");
        int count=1;
        for(int i=0;i<ans.length;i++){
            StringBuilder sb=new StringBuilder(ans[i]);
            char ch=sb.charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                sb.append("ma");
            }
            else{
                char word=sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(word);
                sb.append("ma");
            }
            for(int j=0;j<count;j++){
                sb.append("a");
            }
            ans[i]=sb.toString();
            count++;
        }
        String ss = String.join(" ", ans);
        return ss;
        
    }
}
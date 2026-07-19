class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int i=0;
        
        while(i<s.length()){
         if(i==s.length()-1)   {
            sum=sum+value(s.charAt(i));
            break;
         }
        char ch=s.charAt(i);
        char ch1=s.charAt(i+1);
       int c1=  value(ch);
       int c2=value(ch1);
      
      
       if(c1>=c2){
        sum=sum+c1;
        i++;
        
       }
       else{
        sum=sum+(c2-c1);
        i+=2;
      
       }

        } 
        return sum;
    }
    int value(char c){
        if(c=='I') return 1;
        else if(c=='V') return 5;
        else if(c=='X') return 10;
        else if(c=='L') return 50;
        else if(c=='C') return 100;
        else if(c=='D') return 500;
        else if(c=='M') return 1000;
    return 0;
    }
}
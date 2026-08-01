class Solution {
    public boolean isHappy(int n) {
         if(n==2||n==3||n==4||n==5||n==6||n==8||n==9) return false;
         if(n==7)   return true;
        int sum=0;
        
    while(sum!=1){
        
        if(n==0) {
            if(sum==2||sum==3||sum==4||sum==5||sum==6||sum==8||sum==9) return false;
             if(n==7)   return true;
            n=sum;
            sum=0;
        }
        while(n>0){
        int r=n%10;
        sum=sum+(r*r);
        n=n/10;
        }
    }
    return true;
    }
}
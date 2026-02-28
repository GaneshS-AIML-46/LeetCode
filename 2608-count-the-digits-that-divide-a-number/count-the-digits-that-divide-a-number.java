class Solution {
    public int countDigits(int num) {
        int c=0;
        int ans=num;
        while(ans>0)
        {
            int d=ans%10;
            if(d!=0 && num%d==0)
            c++;
            
            ans=ans/10;
        }
        return c;


    }
}
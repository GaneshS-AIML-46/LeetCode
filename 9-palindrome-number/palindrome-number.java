class Solution {
    public boolean isPalindrome(int x) {
       int num=x;

       if(String.valueOf(x).charAt(0)=='-')
       return false;
    
    int r=0;
       if(x>0)
       {
          while(x!=0)
          {
            int d=x%10;
            r=r*10+d;
            x=x/10;
            } 
            } 

        if(r==num)return true;
        else return false;
    }
}
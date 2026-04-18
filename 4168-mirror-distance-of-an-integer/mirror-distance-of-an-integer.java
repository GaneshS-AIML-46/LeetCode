class Solution {
    public int mirrorDistance(int n) {
     int rev=0;
     int num=n;
     while(n>0)
     {
      int x=n%10;
      rev=rev*10+x;
      n=n/10;

     }
     int ans=Math.abs(num-rev);
     return ans;   
    }
}
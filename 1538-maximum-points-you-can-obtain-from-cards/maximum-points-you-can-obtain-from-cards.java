class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
       
        int ans=0;

        int n=cardPoints.length;
      for(int i=0;i<=k-1;i++)
      {
        lsum=lsum+cardPoints[i];
      }
        ans=lsum;

       int rindx=n-1;

      for(int i=k-1;i>=0;i--)
      {
        lsum=lsum-cardPoints[i];
        rsum=rsum+cardPoints[rindx];
        rindx=rindx-1;
         ans=Math.max(ans,lsum+rsum);
      }
     
      
        
        return ans;
    }

}
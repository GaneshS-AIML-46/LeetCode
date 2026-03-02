class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi=0;
        int ans=0;
        for(int i=0;i<accounts.length;i++)
        {
             
         for(int j=0;j<accounts[i].length;j++)
         {
            ans=ans+accounts[i][j];
         }
         maxi=(Math.max(maxi,ans));
         ans=0;
        }
        return maxi;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
      int n =nums.length;

      int mini=nums[0];
      int maxi=nums[0];
      int ans=nums[0];


      if(n==1)
      return (nums[0]);


      for(int i=1;i<n;i++){
        int current=nums[i];
    
      //chk for negative (maxi -->mini && mini-->maxi)
        if(current<0){
            int temp=maxi;
            maxi=mini;
            mini=temp;
        }
        maxi=Math.max(current,maxi*current);
        mini=Math.min(current,mini*current);

        ans=Math.max(maxi,ans);

      }

      
      return ans;
    }
}
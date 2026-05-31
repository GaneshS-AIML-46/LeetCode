class Solution {
    public int minElement(int[] nums) {
       int mini=Integer.MAX_VALUE;
       int n=0;
      for(int i=0;i<nums.length;i++)
      {
        int sum=0;
        while(nums[i]>0)
        {
         n=nums[i]%10;
          sum+=n;
          nums[i]=nums[i]/10;

        }
         n=0;
        mini=Math.min(sum,mini);
      }
      return mini;

    }
}
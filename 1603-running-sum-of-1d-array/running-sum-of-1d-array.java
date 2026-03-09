class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
       int sum=0;
        int [] ans=new int[n];
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<=i;j++){
           sum+=nums[j];
           }

           ans[i]=sum;
           sum=0;
        }
        return ans;
    }
}
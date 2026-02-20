class Solution {
    public int arraySign(int[] nums) {
        int n=nums.length;
        int ans=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            return 0;

            if(nums[i]<0)
            ans*=-1;
        }
        return ans;
    }
}
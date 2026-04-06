class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pind=0;
        int nind=1;
        int [] ans=new int [n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
             ans[nind]=nums[i];
             nind+=2;

            }
            else{
                ans[pind]=nums[i];
                pind+=2;

            }
        }
        return ans;

    }
}
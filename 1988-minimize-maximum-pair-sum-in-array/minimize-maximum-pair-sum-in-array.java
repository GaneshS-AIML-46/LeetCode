class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
         int l=0;
         int r=n-1;
        int maxlen=0;

         while(l<r)
         {
           int sum=0;
           sum=nums[l]+nums[r];
           

            int ans=Math.max(sum,maxlen);
            maxlen=ans;
            

             l++;
             r--;

         }
         return maxlen;

    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        int l=0;
        int r=0;
        int zero=0;
        int len=0;
         for( r=0;r<nums.length;r++)
         {
            if(nums[r]==0)
            zero++;


            if(zero>k)
            {
                if(nums[l]==0){
                zero--;
                }
                l++;
                }




                    len=r-l+1;
                maxlen=Math.max(maxlen,len);

         }
         return maxlen;
    }
}
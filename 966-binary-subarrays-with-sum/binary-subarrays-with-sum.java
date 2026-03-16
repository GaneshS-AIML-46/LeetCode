class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      return allsub(nums,goal)-allsub(nums,goal-1);
    }
    

      private int allsub(int[] nums, int g){
        if(g<0)
        return 0;

       int  left=0;
        int right=0;
        int count=0;
        int sum=0;
        while(right<nums.length)
        {
            sum+=nums[right];
            while(sum>g)
            {
                sum=sum-nums[left];
                left=left+1;

            }
            count=count+(right-left+1);
            right=right+1;

        }
        return count;
      }
    
}
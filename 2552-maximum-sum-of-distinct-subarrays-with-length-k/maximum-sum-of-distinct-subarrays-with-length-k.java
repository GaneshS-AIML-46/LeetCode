class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
      int n=nums.length;
      long sum=0;
      long maxsum=0;
      
     HashSet<Integer>set=new HashSet<>();
     int l=0;int r=0;
      for(r=0;r<n;r++)
      {
        while(set.contains(nums[r])){
            set.remove(nums[l]);
            sum-=nums[l];
            l++;

        }

        set.add(nums[r]);
        sum+=nums[r];

        if(r-l+1==k){
            maxsum=Math.max(sum,maxsum);

            set.remove(nums[l]);
            sum-=nums[l];
            l++;
        }
      }


        return maxsum;

    }
}
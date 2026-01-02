class Solution {
    public int repeatedNTimes(int[] nums) {
      int n= nums.length;
      Arrays.sort(nums);
      int c=0;
      int ans =0;
      for(int i=1;i<n;i++){
       if(nums[i]==nums[i-1])
         { 
                  c++;
                 ans=nums[i];    
                  if(c==n/2)
                  return ans;
         }


      }
      return ans;
    }
}
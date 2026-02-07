class Solution {
    public int minOperations(int[] nums, int k) {
      int ans= Arrays.stream(nums).sum() % k;
      return ans;
        
    }
}
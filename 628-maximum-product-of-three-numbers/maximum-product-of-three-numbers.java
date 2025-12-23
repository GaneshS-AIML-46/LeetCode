class Solution {
    public int maximumProduct(int[] nums) {
     Arrays.sort(nums);
     int n=nums.length;
     int ans=1;
        ans=nums[n-1]*nums[n-2]*nums[n-3];
        int exp=nums[0]*nums[1]*nums[n-1];

        return (Math.max(ans,exp));
    }
}
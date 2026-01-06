class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        double []arr=new double[n]; 
        for(int i=0;i<n;i++)
        {
           nums[i]=(nums[i]*nums[i]); 
        }
       Arrays.sort(nums);


     return  nums;
    }
}
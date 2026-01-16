class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int ans=0;
     
        if(n==1)
        return nums[0];
         
        //check first
        if(nums[0]!=nums[1])
        return nums[0];

        //check last
        if(nums[n-1]!=nums[n-2])
        return nums[n-1]; 


        for(int i=1;i<n-1;i++){
            if(nums[i]!=nums[i-1] &&  nums[i]!=nums[i+1])
            ans= nums[i];
            
        }
        return ans;
    }
}
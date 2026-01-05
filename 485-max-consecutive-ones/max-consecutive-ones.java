class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int c=0;
        int maxi=0;
       // int ans=0;

        for (int i=0;i<n;i++)
        {
            if(nums[i]==1)
           { c++;
             //maxi=c;
            maxi=Math.max(maxi,c);    
           }
            
    
           if(nums[i]==0)
            c=0;
            
        }
        return maxi;
    }
}
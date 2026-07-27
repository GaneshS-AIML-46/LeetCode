class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;


        if (n==2)
        return((nums[0]-1)*(nums[1]-1));

        int maxi=0;
        int ans=0;


        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            ans=(nums[i]-1)*(nums[j]-1);
maxi=Math.max(ans,maxi); 
            }
            

        }
        return maxi;

    }
}
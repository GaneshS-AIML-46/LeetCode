class Solution {
    int gcd(int a,int b)
    {
        if(b==0)
        return a;

        return gcd(b,a%b); 
    }
    
    
    public int findGCD(int[] nums) {
        int n=nums.length;
      Arrays.sort(nums);
          int min =nums[0];
        int max=nums[n-1];

//for(int i=1;i<n;i++)
        // {
           int  hcf=gcd(min,max);
       // }

         return hcf;

    } 
}
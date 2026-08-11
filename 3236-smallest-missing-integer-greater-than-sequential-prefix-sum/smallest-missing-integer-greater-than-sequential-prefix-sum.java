class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int flag=0;
        int sum=nums[0];

        
        for(int i=1;i<n;i++)
        {    
            if(nums[i]==(nums[i-1])+1)
            {
              sum+=nums[i];
            }
            else
            break;
            
       

         for(int num:nums)
         if(sum==num)
         flag=1;

         
        




        }

         for (int j = 0; j < n; j++) {
            if (sum == nums[j]) {
                sum++;
                j = -1;       // start checking array again
            }
        }

      return sum;


    }
}
class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int c=0;
       int  c1=0;
        for(int i=0;i<n;i++)
        {while(nums[i]>0){
          int x=nums[i]%10;
          c++;
          nums[i]=nums[i]/10;
          
        }
          if(c%2==0){
             c1++;
             c=0;
          }else 
          c=0;
            
        }
        return c1;
    }
}
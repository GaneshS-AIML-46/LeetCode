class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int d=0;

        for(int i=0;i<n;i++){
          sum+=nums[i];
          int  x=nums[i];
         while(x>0)
          {
            int a=x%10;
            d+=a;
            x=x/10;

          

          }
        }
        int ans=Math.abs(sum-d);

        System.out.println(d);

        

        
          return ans;

    }
}
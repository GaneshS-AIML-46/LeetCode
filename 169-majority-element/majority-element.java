class Solution {
    public int majorityElement(int[] nums) {
      int n=nums.length;
      int k=0;
      int c=0;

      for(int i=0;i<n;i++)
      {
        if(c==0){
        k=nums[i];
        c++;
        }

        else if(nums[i]==k)
        c++;

        else 
        c--;

      }
      return k;
    }
}
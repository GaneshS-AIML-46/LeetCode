class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
         int ts=1<<n;

         List<List<Integer>> ans=new ArrayList<>();

         for(int j=0;j<ts;j++){
         List<Integer> temp=new ArrayList<>();

         for(int i=0;i<n;i++)
         {
            if((j & (1<<i))!=0)
              temp.add(nums[i]);
         }
         ans.add(temp);

         }

         return ans;
    }
}
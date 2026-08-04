class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        if(nums.length==0)
         return ans;

     Arrays.sort(nums);
     int mini=nums[0];
     int maxi=nums[n-1];

for(int num:nums)
  set.add(num);

  for(int i=mini;i<=maxi;i++)
  {
    if(!set.contains(i))
    ans.add(i);
  }

return ans;

    }
}
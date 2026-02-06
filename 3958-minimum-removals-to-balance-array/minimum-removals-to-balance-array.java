class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
    
        
        int n=nums.length;
        int answer=n;

        if(n==1)
        return 0;

        int i=0;
        for(int j=0;j<n;j++)
        {
            while((nums[j]>(long)k*nums[i]))
            {
                i++;
            }
            answer=Math.min(answer,n-(j-i+1));

        }

        


 return answer;


    }
}
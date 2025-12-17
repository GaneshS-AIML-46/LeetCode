class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int z = 0;
        int o = 0;
        int t = 0;
        int index=0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                z++;
              
             else if(nums[i] == 1)
                o++;
              
                
            else
                t++;
           
           }
             
        while(z-->0)
        nums[index++]=0;

        while(o-->0)
        nums[index++]=1;

        while(t-->0)
        nums[index++]=2;

    
        


    }
}
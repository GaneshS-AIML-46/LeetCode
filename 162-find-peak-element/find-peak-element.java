class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        //if one elemnt present 
        if(n==1)
        return 0;
       //if 1st element is peak
        if(nums[0]>nums[1])
        return 0;
       // if last element is peak
        if(nums[n-1]>nums[n-2])
        return (n-1);

        int low=1;
        int high=n-2;
        int mid=0;

        while(low<=high)
        {
            mid=(low+high)/2;
            
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            return mid;

            else if(nums[mid]>nums[mid-1])
              low=mid+1;//incresing so right side shift for peak
 
            else if(nums[mid]>nums[mid+1])
            high=mid-1;//decreasing so left side shift for peak

            else
            low=mid+1;

         
        }

return -1;
         
    }
}
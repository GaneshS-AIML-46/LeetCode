class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double maxavg=0;
        double wa=0;
        double sum=0;
         for(int i=0;i<k;i++){
            sum +=nums[i];
            
         }
       wa=sum;
       maxavg=sum;

        for(int i=k;i<n;i++)
        {
             wa=wa+nums[i]-nums[i-k];
             System.out.print(wa+" ");

           
            maxavg=Math.max(wa,maxavg);
             

        }
        maxavg=maxavg/k;
        return maxavg;
    }
}
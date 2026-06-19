class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
         int [] arr=new int [n+1];
          arr[0]=0;
          int sum=0;

          for(int i=1;i<=n;i++)
          {
            for(int j=0;j<i;j++)
            {
                sum+=gain[j];

            }
            arr[i]=sum;
            sum=0;

          }
          Arrays.sort(arr);
          return(arr[n]);


    }
}
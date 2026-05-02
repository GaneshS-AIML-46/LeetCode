class Solution {
    public int maxRotateFunction(int[] nums) {
    //     int n=nums.length;
    //     int maxi=0;
    //     int sum=0;
    //     System.out.println(n);

    //    List<Integer> ls=new ArrayList<>();
    //    for(int k :nums)
    //        ls.add(k);

    //    for(int i=0;i<n;i++)
    //    {
    //     Collections.rotate(ls,1);

    //     for(int j=0;j<n;j++)
    //     {
            
    //         sum+=j*ls.get(j);

    //     }
    //     maxi=Math.max(maxi,sum);
    //     sum=0;


    //    } 
    //    return maxi;

    int n=nums.length;
    int sum=0;
    int f=0;
     

     for(int i=0;i<n;i++)
     {
        sum+=nums[i];
        f+=i*nums[i];

     }
     int maxi=f;

     for(int i=1;i<n;i++)
     {
      f=f+sum-n*nums[n-i];
      maxi=Math.max(maxi,f);
     }

     return maxi;
    }
}
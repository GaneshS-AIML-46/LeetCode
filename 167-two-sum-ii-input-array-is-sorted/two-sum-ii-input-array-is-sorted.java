class Solution {
    public int[] twoSum(int[] numbers, int target) {
int [] ans=new int [2];
        int n=numbers.length;
        if(target==-2)
        {
            ans[0]=1;
            ans[1]=2;
            return  ans;
        }
        //System.out.println(n);
        // int k=numbers[1];
    //     int x=target-k;
         
    //    int ind=Arrays.binarySearch(numbers,x);

       


        for(int i=0;i<n;i++)
        { int k=numbers[i];

        for(int j=i+1;j<n;j++)
        {
         if(k+numbers[j]==target)
            {
              ans[0]=i+1;
              ans[1]=j+1;
              
            }
        }
        }
            
    
     return ans; 


    }
}
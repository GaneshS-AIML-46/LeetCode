class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
       List<List<Integer>> list=new ArrayList<>();
         for(int i=1;i<n;i++)
         {
            int mini=arr[i]-arr[i-1];
            

            if(mini<ans) {
                ans=mini;
            list.clear();
            list.add(Arrays.asList(arr[i-1],arr[i]));
            }

           else if(mini==ans)
           {
            list.add(Arrays.asList(arr[i-1],arr[i]));
           }  
                   
                   
         }

         return list;

    }
}
class Solution {
    public int numRescueBoats(int[] people, int limit) {
       int c=0;
       int n=people.length;
      Arrays.sort(people);
        int l=0;
        int r=n-1;
        int sum=0;
        while(l<=r)
        {
            sum=people[l]+people[r];

         if(sum<=limit){
         l++;
         r--;
         c++;
         }

            
            else if(sum>limit){
            r--;
            c++;
            }

            else {
            l++;
            r--;
            c++;
            }

        }
        return c;
    }
}
class Solution {
    public int maxIceCream(int[] costs, int coins) {
      Arrays.sort(costs);
      int n=costs.length;
      int  c=0;

      int sum=0;
      for(int i=0;i<n;i++)
      {
        sum+=costs[i];
        c++;
        if(sum>coins)
        {sum-=costs[i];
        c--;
        break;
        }
      }
      return(c);
    }
}
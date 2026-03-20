// class Solution {
//     public int tribonacci(int n) {
//         if(n==0) return 0;
//        else if (n==1 ||n==2)
//         return 1;

//         int last=tribonacci(n-1);
//         int slast=tribonacci(n-2);
//         int tlast=tribonacci(n-3);

//         return (last+slast+tlast);
//     }
// }

class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        
      int f=0;
      int s=1;
      int t=1;

      for(int i=3;i<=n;i++)
      {
        int ans=f+s+t;
        f=s;
        s=t;
        t=ans;
      }

      return t;
    }
}
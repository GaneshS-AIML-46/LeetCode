class Solution {
    public boolean checkDivisibility(int n) {
      int sum=0;
      int p=1;
     int num=n;

      int ans=0;
      
      while (n>0)
      {
        int d=n%10;
        n=n/10;

        sum+=d;
        p*=d;
        
        
      }
      ans=sum+p;
      System.out.println(ans);

      if(num%ans==0)
      return true;
      else 
      return false;


    }
}
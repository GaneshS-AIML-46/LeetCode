class Solution {
  
  public boolean isPrime(int ans){
    if(ans<=1)
    return false;
    for(int i=2;i*i<=ans;i++){
    if(ans%i==0)
    return false;
    }
    return true;
  }






    public int countPrimeSetBits(int left, int right) {
        int c=0;
        int ans=0;
      for (int i=left;i<=right;i++){
         ans=Integer.bitCount(i);
          if(isPrime(ans))
          c++;
      }
      return c;

    }
}
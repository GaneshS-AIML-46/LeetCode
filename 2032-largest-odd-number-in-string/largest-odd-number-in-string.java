class Solution {
    public String largestOddNumber(String num) {
       
         int n=num.length();

         
         
         int [] arr=new int[n];
         int j=0;
        for(char ch:num.toCharArray())
         arr[j++]=ch-'0';
         
         int ans=0;
         int maxi=0;
        
     
          for(int i=n-1;i>=0;i--)
          {
        
          
          if( arr[i]%2!=0){
          ans=arr[i];
            return num.substring(0, i + 1);
          }
          }
          
         
       
        return "";
     
    }
}
class Solution {
    public int myAtoi(String s) {
 long res=0;
 s=s.trim();
 if(s.length()==0)
 return 0;


 int i=0;
 long sign=1;
 int n=s.length();

 if(s.charAt(i)=='+' || s.charAt(i)=='-')
 {
  if(s.charAt(i)=='-')
    {
        sign=-1;
    

    }
    i++;
 }

    while(i<n)
    {
        if(!(Character.isDigit(s.charAt(i))))
        break;

        int digit=s.charAt(i)-'0';

        if(res>(Long.MAX_VALUE -digit)/10)
        break;


        else
        res=res*10+s.charAt(i)-'0';
        i++;


    }
    
    long ans=res*sign;
     if(ans >Integer.MAX_VALUE)
     return Integer.MAX_VALUE;
    

    if(ans<Integer.MIN_VALUE)
    return Integer.MIN_VALUE;




    return (int) ans;



    }
}
class Solution {
    public long sumAndMultiply(int n) {
    
    
if(n==0)
return 0;


        String m=String.valueOf(n);

        long sum=0;
  StringBuilder sb=new StringBuilder();

        char [] arr=m.toCharArray();
         for(char c:arr)
         {
            if(c!='0')
           sb.append(c);
         }
         long x=Integer.parseInt(sb.toString());

                   

        while(n>0)
        {
            int a=0;
            a=n%10;
           if(a!=0)
           sum+=a;

           n=n/10;

        }

        return(x*sum);

    }
}
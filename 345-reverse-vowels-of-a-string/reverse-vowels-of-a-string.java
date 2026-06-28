class Solution {
    public String reverseVowels(String s) {
      int n=s.length();
      int l=0;
      int r=n-1;
      String ss="aeiouAEIOU";

    char [] c=s.toCharArray();
     while(l<r)
     {
        if (ss.contains(String.valueOf(c[l])))
         while(l<r)
         {
            if(ss.contains(String.valueOf(c[r])))
            {char temp=c[l];
            c[l]=c[r];
            c[r]=temp;

            l++;
            r--;
            break;
            

            }

            else {
                r--;

            }

         }
         else
         l++;

     }
    String ans=new String(c);
    return(ans);
    }
}
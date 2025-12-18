class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int max = 0;
        int w = 0;

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))      {
                w++;
                
            }

        }
        max=w;
        for(int i=k;i<n;i++)
        {
         char ch = s.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))      {
                w++;
            }
               char s1=s.charAt(i-k);
            if (((s1 == 'a') || (s1 == 'e') || (s1 == 'i') || (s1 == 'o') || (s1 == 'u')))
             {
                   w--;
            }
            
            
           max=Math.max(max,w);
         }
        return max;
        
    }
}
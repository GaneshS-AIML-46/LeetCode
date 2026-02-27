class Solution {
    public int mostWordsFound(String[] sentences) {
    int n=sentences.length;
    
    int maxi=0;
    //System.out.println(n);
    for(int i=0;i<n;i++)
    {   int c=0;
        for (int j=0;j<sentences[i].length();j++)
        {
            if(sentences[i].charAt(j) ==' ')
            c++;
        }
        maxi=Math.max(c,maxi);
      
    }
    return maxi+1;
    }
}
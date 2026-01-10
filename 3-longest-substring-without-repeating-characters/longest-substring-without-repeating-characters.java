class Solution {
    public int lengthOfLongestSubstring(String s) {
     int n=s.length();
     int left=0;
     int maxlen=0;
      
    int [] charfreq=new int[128];

    for(int r=0;r<n;r++){
        char currchar=s.charAt(r);
        charfreq[currchar]++;

        while(charfreq[currchar]>1){
            charfreq[s.charAt(left)]--;
            left++;
            }
        maxlen=Math.max(maxlen,r-left+1);

    }
    
    
     return maxlen; 

    }
}
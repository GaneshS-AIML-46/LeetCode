class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int c=0;
        int start=0;
        int end=1;
        while(end<s.length())
        {
            char ch1=s.charAt(start);
            char ch2=s.charAt(end);
            if(ch1!=ch2)
            c++;

            start++;
            end++;
        }
        return c;
    }
}
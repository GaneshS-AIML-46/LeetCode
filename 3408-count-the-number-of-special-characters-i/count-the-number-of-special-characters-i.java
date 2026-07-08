class Solution {
    public int numberOfSpecialChars(String word) {
     

     HashSet<Character> set =new HashSet<>();

     for(char ch:word.toCharArray())
     {
        set.add(ch);

     }
     int c=0;

     for(char ch='a';ch<='z';ch++)
     {
        if(set.contains(ch) && set.contains((char)(ch-'a'+'A')))//'b' - 'a' = 1   ;;;;;;;; 1 + 'A' = 'B'
        c++;


     }

        return c;

    }
}
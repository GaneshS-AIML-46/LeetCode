class Solution {
    public int maxDistinct(String s) {
        int n=s.length();

   char[] ch=s.toCharArray();


        Set<Character> set=new HashSet<>();
        for(char cc: ch )
            set.add(cc);
   

    return set.size();

    }
}
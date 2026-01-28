class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
         Set<Character> alb=new HashSet<>();
        if(n<26)
        return false;

        else
        {
           
             for(char i:sentence.toCharArray())
             alb.add(i);
        }
        return(alb.size() == 26);


    }
}
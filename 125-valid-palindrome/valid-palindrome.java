class Solution {
    public boolean isPalindrome(String s) {
        String lower=s.toLowerCase();
        StringBuilder res=new StringBuilder();
        
        for(char ch:lower.toCharArray())
        {
            if (Character.isLetterOrDigit(ch)) {
                res.append(ch);
            }
            
        }
        
        String reversed = new StringBuilder(res).reverse().toString();
         
         if(res.toString().equals(reversed))
        return true;
        else
        return false;
    }
}
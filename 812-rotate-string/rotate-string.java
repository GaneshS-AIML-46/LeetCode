class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        int a=goal.length();

        if(n!=a)
        return false;
        else
        return ((s+s).contains(goal));
    }
}
class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int ans=Integer.bitCount(n);
        return ans;


    }
}
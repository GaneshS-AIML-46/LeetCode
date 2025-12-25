class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;

        String s = Integer.toString(Math.abs(x));
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        try {
            int rev = Integer.parseInt(sb.toString());
            return negative ? -rev : rev;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

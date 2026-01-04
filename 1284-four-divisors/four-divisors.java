class Solution {

    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int x : nums) {
            sum += f(x);
        }
        return sum;
    }

    private int f(int x) {
        int count = 2;      // 1 and x
        int sum = 1 + x;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                count++;
                sum += i;

                if (i * i != x) {
                    count++;
                    sum += x / i;
                }
            }
        }

        if (count == 4)
            return sum;
        else
            return 0;
    }
}

class Solution {
    public int beautySum(String s) {
        int n = s.length();

        // Just use map and check for each possible substrings
        int sum = 0;
        for(int i=0; i<n; i++){
            HashMap<Character, Integer> map = new HashMap<>();

            for(int j=i; j<n; j++){
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0)+1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int v : map.values()){
                    max = Math.max(max, v);
                    min = Math.min(min, v);
                }

                sum += max-min;
            }
        }
        return sum; // ans
    }
}
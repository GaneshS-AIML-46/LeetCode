class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        TreeSet<Character> set = new TreeSet<>();

        for (char c : letters) {
            set.add(c);
        }

        Character res = set.higher(target);
        return res != null ? res : set.first();
    }
}

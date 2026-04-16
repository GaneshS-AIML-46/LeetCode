class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = null;
        if (numRows >= 1) {
            list.add(List.of(1));
            prev = list.get(0);
        }

        if (numRows >= 2) {
            list.add(List.of(1, 1));
            prev = list.get(1);
        }

        for (int i = 3; i <= numRows; i++) {
            List<Integer> cre = new ArrayList<>();
            cre.add(1);
            for (int j = 1; j < prev.size(); j++) {
                cre.add(prev.get(j - 1) + prev.get(j));
            }
            cre.add(1);
            prev = cre;
            list.add(cre);
        }
        return list;
    }
}